import java.util.*;

class Funadd{

public static int sumNumber(int a,int b){
    
    int c=a+b;
    return c;
}

    public static void main(String args[]){
        System.out.println("Enter the frist number");
           Scanner sc = new Scanner(System.in);
           int a=sc.nextInt();
           System.out.println("Enter the second number");
           int b=sc.nextInt();

       int sumnew=sumNumber(a,b);  //sumNumber se jo bhi valu c variable le ke aayega usko main function ke ander  
System.out.println("sum of your two number is "+sumnew) ;        //naye variable me(sumnew) stor ker ke print kera dege 
    }
}