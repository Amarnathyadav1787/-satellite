import java.util.*;

class Recurtion2{



    public static void printNumber(int n,int a){       //outer function run only one times
          if(n==a){                           //supposed base limit is 100
            return;}
          
  System.out.print(" "+n);                   
        printNumber(n+1,a);

    }



    public static void main(String args[]) {

  System.out.println("Please Enter the Recurtion value");
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   System.out.println("Enter base limit");
  int a=sc.nextInt();
   printNumber(n,a);



    }
}