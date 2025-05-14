import java.util.*;

class ArrayXsearch{

    public static void main(String args[]){
System.out.println("Enter the size of array");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt(); //taking size of array from user

    int []marks = new int[size];

    //used input loops stor valu in array
for(int i=0;i<marks.length;i++){

    marks[i]= sc.nextInt();

}
   //taking x number that want to search in array 
   System.out.println("Enter your number to find index of that number");
           int x = sc.nextInt();

//used output loop
   for(int i=0;i<size;i++){
   if(marks[i]==x)                  //ye puri lyst me jayega leaner searh karega suru se last tak jha jha jis jis loction pe array me 
                                   //stor valu ka maan x se braber milega uska index print hoga 
   System.out.println("indext of"+x +" number is ="+i);

   }

    }
}
