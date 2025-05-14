import java.util.*;

class Recurtion5{


public static void printFib(int a ,int b,int n){
if(n==0){

return;
}

 int c = a+b;
System.out.print(" "+c);
printFib(b,c,n-1);// now valu is interchange for next term it mean b behave like a and c behave like b for next term 
}                  //same processes is run for each term up to base condition 

    public static void main(String args[]){
     int a=0;
     int b=1;
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of term print in fibonacci series formet ");
     int n = sc.nextInt();
     System.out.println(a);
     System.out.println(b);
     printFib(a,b,n-2);

    }
}