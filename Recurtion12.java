class Recurtion12 {


  public static void moveAllx(String str,int idx,int count, String newString){
    
    
    if(idx==str.length()){
       for(int i=0;i<count;i++)
       newString+='x';                       //adding count tiems  in the newString
         System.out.println(newString);
         return;
    }

      char currentChar = str.charAt(idx);
      if(currentChar=='x'){
       count++;                            //total no of x comes is count here
       moveAllx(str,idx+1,count,newString);  
      }
  else{
         newString+=currentChar;                  //if x is not comes than rest latter added in newString contineousaly
         moveAllx(str,idx+1,count,newString);
    
  }


  }


    public static void main(String args[]){

     String str= "amaxxrxnaxxh";

    moveAllx(str,0,0," ");

   }
}