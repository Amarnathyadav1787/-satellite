import java.util.*;
class Strings{

    public static void main(String args[]){
 //System.out.println("Enter Your Namme Here");
 //Scanner sc = new Scanner(System.in);
 //String name = sc.nextLine();
 //System.out.println(name);
//........................................................uper ka code kewal string ko input lekar print karane ke liye bna hai esme next 
                                              //sc.nextLine();  pura sentance print karega jabki sc.next(); kewal ek word ko print karega
                                                         
//concatenation it mean adding of two string..
String fristName = "Amarnath";
String lastName = "yadav";
String fullName = fristName+"@"+lastName;
System.out.println(fullName.length());     //String class ke andar length() nam ka ek fuction hota hai jo hamari string ki length ko
                                           //calcule ker ke humko de dega   

//..............................................................................................................................
//String ki size 14 hai ab string me sare charecter ko print krane ke liye charAt(); function ko loop chalana padega 

for(int i=0;i<14;i++){
System.out.println(fullName.charAt(i));

}


    }
}