import java.util.HashSet;

class Recurtion14{


public static void subsequence(String str,int idx,String newString,HashSet<String> set){
  
    if(idx==str.length()){
          if(set.contains(newString)){
          return;
        } 
  
  else{
       System.out.println(newString);
       set.add(newString);
       return;
        }
    }
  
    char currentChar = str.charAt(idx);

  
            //to be comes in string
            subsequence(str,idx+1,newString+currentChar,set);
            //if charecter of string not want to be comes
            subsequence(str,idx+1,newString,set);
}
    public static void main(String args[]){

 String str="aaa";
 HashSet<String> set = new HashSet<>();  // create a set and not repeat the same value in output
 
 subsequence(str,0,"",set);
      
}
}