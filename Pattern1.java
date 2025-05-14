import java.util.*;

class pattern1{

    public static void main (String args[]){

System.out.println("Enter the length of Squar");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
System.out.println("Enter the breath of squar");
int b = sc.nextInt();

for(int i=1;i<=a;i++){

    for(int j=1;j<=b;j++){              //for loop ke andar for loop esi kobolte hai nasted loop
System.out.print("*");                 //if we use two for loop the we use two varibale like(i,j )to represent counter valu 

    }
    System.out.println();
}



    }
}