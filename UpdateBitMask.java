import java.util.*;
class UpdateBitMask{

    public static void main(String args[]){

     int n=5;   // in binart form 0101
     int pos=1;
     int bitMask = 1<<pos;
    
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the valu you want to update");
      int ops = sc.nextInt();

      if (ops==1) //to update value use similar to set bit rule
      {
        int newNumber= bitMask|n;
        System.out.println("seted number in decimal form is "+newNumber);

      }
      else if(ops==0){    // to update 0 valu use similar to clear bit rule 

       int newBitMask=~(bitMask);
       int newNumber2=newBitMask & n;
       System.out.println("Seted number in decimal from is "+newNumber2);


      }
      else 
      System.out.println("Plase inter the valid binary number");


      


    }
}