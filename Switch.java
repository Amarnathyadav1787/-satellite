import java.util.*;

class Switch
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int d= sc.nextInt();
//if(d==1)
//System.out.println("Samsung Laptop  service");

//else if (d==2)
//System.out.println("Samsumg Moblie service");

//else if (d==3)
//System.out.println("Samsung TV service");


//else 
//System.out.println("Please press a valid input");

switch(d)
{
case 1: System.out.println("Samsung Laptop"); 
break;
case 2: System.out.println("samsung Mobile");
break;
case 3: System.out.println("samsung phone");
break;
default : System.out.println("invalid input");

}
 

}
}