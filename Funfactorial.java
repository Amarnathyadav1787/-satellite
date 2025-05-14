import java.util.*;

class Funfactorial{

public static int numFactorial(int n){

    



   int factorial=1;

    for(int i=n;i>=1;i--){
         
        factorial=factorial*i;
        
    }
 return factorial;
}


public static void main (String args[])
{

System.out.println("Enter Your Number to find factorial of that number");
Scanner sc= new Scanner(System.in);
int n = sc.nextInt();

int nfactorial = numFactorial(n);

System.out.println("Factorial Result is "+nfactorial);

}

}