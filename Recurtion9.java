import java.util.*;

class Recurtion9{

  public static void printRev(String str,int idx){

    if(idx==0){

        System.out.print(str.charAt(idx));
        return;
    }
     System.out.print(str.charAt(idx));
    printRev(str, idx-1);
    




  }
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Word want to revers print");
        String str =sc.next();
  // String str ="abcd";
  
printRev(str, str.length()-1);


    }
}