 
 import java.util.*;
 
 class Recurtion{
public static void printNumber(int n){
    if(n==0){                        //n==0 is the base condition if we not defiend base condition than stak overflow is happen mean 
    return;         //memory is in form of stak is full due to infinity time run oflet n=5 then (n-1) that is 5 4 3 2 1 0 -1 -2 ...infinite
        }

          System.out.print("  "+n);//outer function run only one time 
          printNumber(n-1);        //inner fuction run rest all time upto base condition logic of all function is same
         }

          
  



public static void main(String args[]){
 
    System.out.println("Eter your Recurtion valu want to print");
Scanner sc =new Scanner(System.in);
int n = sc.nextInt();

printNumber(n,);


}


 }