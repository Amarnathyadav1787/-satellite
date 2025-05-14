class BackTraking{

public static void printPermotation(String str,String permotation,int idx){ //idx is used for decided the latter seated on (- - - )1st 2nd 3rd position

if(str.length() ==0){
    System.out.println(permotation);
    return;
}

for(int i=0;i<str.length();i++){

    char currChar =str.charAt(i);
    String newString = str.substring(0,i) + str.substring(i+1);
    printPermotation(newString,permotation+currChar ,idx+1);
}

} 
 
public static void main(String args[]){
String str="ABC";

printPermotation(str," ",0);
}

}