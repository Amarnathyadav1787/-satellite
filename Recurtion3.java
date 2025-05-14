import java.util.*;

class Recurtion3{

public static void printNumber(int i,int n,int sum){
    if(i==n){

        sum +=n;    //it valu is sum=sum+n;
        System.out.println("sum of frist  "+n+" natural number is = "+sum);
        return;
    }
       sum+=i;                 //memory stak start full one by one up to  n number or base condition
       printNumber(i+1,n,sum); //inside the fuction we call outer function again so fuction calling again and again up to break condition
                               //or break condition
       System.out.println(i);  // revers  n number case comes because now memory stak becomes start delet one by one in decreasing order
}                              //it happen due to no any outher statment present in our function after reaching base condition


public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Valu of N Natural Number");
    int n=sc.nextInt();
     printNumber(1,n,0);


}
}