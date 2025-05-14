import java.util.*;
class Recurtion7{


public static int calPower(int x,int n){

if(n==0){
    return 1;
}
if(x==0){
    return 0;
}
    if(n%2==0)  //for Odd
    return calPower(x,n/2)*calPower(x,n/2);
     else          // for even
return calPower(x,n/2)*calPower(x,n/2)*x;



}


public static void main(String args[]){


Scanner sc = new Scanner(System.in);
System.out.println("Enter the base of NUmber");
int  x = sc.nextInt();
System.out.println("Enter the Power NUmber");
int n = sc.nextInt();

int ans = calPower(x,n);
System.out.println("your answer is "+ans);




}


}