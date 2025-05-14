import java.util.*;
class StringCompare{

public static void main(String args[]){

System.out.println("Enter your Frist String ");
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();

System.out.println("Enter your 2nd String ");
String s2 = sc.nextLine();


//String s1 = "Amar";
//String s2 = "Amar";
//........................  .compareTo() function is used in java to compare two string s1.s2 then +ve valu s1<s2 -ve valu s1=s2 then 0 output
                                               
if(s1.compareTo(s2)==0)
 System.out.println("String are equla");
    else if(s1.compareTo(s2)>0)
    System.out.println("1st String is grather than 2nd string");
 
 else
    System.out.println("1st string is lower than second string ");




    
}

}