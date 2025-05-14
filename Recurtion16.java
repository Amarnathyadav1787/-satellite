class Recurtion16{

    public static void printPerm(String str ,String permotation){
  if(str.length()==0){
                 System.out.println(permotation);
                 return;
  }
      for(int i=0;i<str.length();i++){
char currChar = str.charAt(i);
      
          String newStr=str.substring(0,i)+str.substring(i+1); //i+1 se last tak hai per usko dikhate nhi haistr.substring(0, i): यह substring method है, जो string के शुरुआत से लेकर i index तक का part निकालता है, लेकिन i वाले index को शामिल नहीं करता।

                                                                          //str.substring(i + 1): यह substring method i + 1 से लेकर string के अंत तक का part निकालता है।
          
                                                                          //अब, यह दोनों substrings मिलाकर एक नई string बनाते हैं, जिसमें i वाले index का character छोड़ दिया जाता है।

          printPerm(newStr,permotation+currChar);
         
    }
  }


    public static void main(String args[])
    {
      String str="abc";
      printPerm(str,"");

    }
}