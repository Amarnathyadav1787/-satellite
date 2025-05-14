import java.util.*;

class Funmulti{

    public static int numMulti(int a,int b){

   int c=a*b;
   return c;

    }

public static void main(String args[]){

System.out.println("Enter 1st number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.println("Enter second number");
int b = sc.nextInt();

//int newmulti = numMulti(a,b);                                           //print by taking valu in a new variable
//System.out.println("multipication of your two digit are = "+newmulti);  //

System.out.println("Product of your two number is "+numMulti(a,b));     // print the return valu of our desine function directly without 
                                                                      // taking a new variable

}
}
