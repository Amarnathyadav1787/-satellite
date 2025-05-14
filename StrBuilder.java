
import java.util.*;
class StrBuilder{

    public static void main(String args[]){

        StringBuilder sb = new StringBuilder("Amar");   //hum string ko n leakr StringBuilder() function ka use ker rhe hai ye function 
                                                  //ye suvidha deta hai ki hum kisi word ko aasani se uodate ker sakte hai 
        System.out.println(sb);

      System.out.println(sb.charAt(0)); //charAt ko jaise string me use kerte thai waise hi StringBuilder me bhi use ker lege
    sb.setCharAt(0,'B'); //at any index of String we chane the latter of string here Amar change in to Bamer by setCharAt(index,'char') fun.
    System.out.println(sb);
      
       sb.insert(0,'J');     //at any index of String we add a new letter here Bamar chang into JBmar by insert(index,'char') fun.
    System.out.println(sb);
     
    sb.delete(0,1);
    System.out.println(sb);
        sb.append("  b");
        sb.append("om");
        sb.append(" ");
        sb.append(" fat gya");
             //...................append("char") have same work as .insert(index,'char') only difference is that by .insert() we
                                 //add latter or word at any place by the help of index number

                                 System.out.println(sb);
                              System.out.println(sb.length());   //used to find stringBuilder length by same fuction used in string
    }
}