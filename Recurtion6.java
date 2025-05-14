import java.util.*;
class Recurtion6{


public static int calPower(int x,int n){

if(n==0){
    return 1;
}
if(x==0){
    return 0;
}
    int xnm1 = calPower(x,n-1);
 
    int result = x*xnm1;
return result;


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