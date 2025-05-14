import java.util.*;
class Lessequal
{
public static void main(String args[])
{

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a==b)
    {
        System.out.println("Number is Equal");
    }
    else if(a>b)
    {
       System.out.println(" Frist number is grather than Second number");

    }

else
{

    System.out.println("Frist number is lesser than Second number");
}

    }
}