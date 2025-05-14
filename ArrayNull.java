import java.util.*;
class ArrayNull{

    public static void main(String args[]){


System.out.println("Enter the Size of Array");

Scanner sc = new Scanner(System.in);
int size = sc.nextInt();             //yha input se jo value aayegi usko size nam  ka variable hold karega
int []marks = new int[size];

//input loop
for(int i=0;i<size;i++){

    marks[i] =sc.nextInt();       //aaray me pahale hi data type defind hai marks[i] esliye yha int likhne ki jarurat nhi hai
}                                 //user se jo hum input lege wo kitni bar lehe wo loop ki trminating condition btayegi 
                                   //i<size ka matlab size 10 liye hum to valu 0 se 9 wa index tak humse input khata khat legi 


//output loop
for(int i=0;i<size;i++){            
System.out.print(" "+marks[i]);
}

    }
}