import java.util.*;

class Recurtion4{



    public static int calculateFact(int n){
     if(n==1|n==0){
        return 1;
     }

     int Fact_nm1=calculateFact(n-1);
     int factorial = n*Fact_nm1;
     return factorial;
        

    }
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Please Enter the factorial Number ");
int n= sc.nextInt();
 int result=calculateFact(n);
System.out.println( "factorial of "+n+" Natural Number is  "+ result);
}

}