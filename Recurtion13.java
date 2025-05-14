class Recurtion13{

   public static boolean map[]= new boolean[26];  //create  a boolean type array having size is 26 and name is map

   public static void removeDublicate(String str,int idx,String newString){
    if(idx==str.length()){
     System.out.println(newString);
     return;
    }
      
    char currChar = str.charAt(idx);
   if(map[currChar-'a']==true){  //it may be written as if(map[currChar-'a']) by default it treted a true
     removeDublicate( str,idx+1,newString);
    
   }
  else{
 
 newString+=currChar;
 map[currChar-'a']=true;
 removeDublicate(str,idx+1,newString);

  }
   }
    public static void main(String args[]){

String str = "axbcxxd";
removeDublicate(str,0,"");


}


}