import java.util.ArrayList;
import java.util.Collections;

public class L25ArrayLis{

    public static void main(String args[]){
    ArrayList<Integer> list1= new ArrayList<>();
    //ArrayList<String> list2 =new ArrayList<>();
  //  ArrayList<Boolean>list3 = new ArrayList<>();

    //..................................................add element in ArrayList....................................................

    list1.add(5);  //.add function is used to add value in our defind ArrayList. in this case value is added at last index autometically
    list1.add(10);
    list1.add(50);
    list1.add(70);

    System.out.println( list1);

    //.................................................how to gete lement..in ArrayList...................
int element = list1.get(2);//.get(index no of ArrayList) this method are used to data 
System.out.println("the stord element at 2 insex is "+element);

//...............................................add element in between the ArrayList........................
     list1.add(2,1787);   //....add(Index no where we want to add number,value of number want to add);
     System.out.println(list1);  

//...............................................set the new element at any position in ArrayList.............
        list1.set(0,500) ;  // before it at 0 index value is 5 but now by method  (set(index no,seted value);)
         System.out.println(list1);        // value change from 5 to 500

 //.........................................remove any element form our ArrayList......................
        list1.remove(1);      //   use remove function to remove any number for our ArrayList
        System.out.println(list1);      
//...........................................to find the Size of our ArrayList.......................................
       int size = list1.size();    // a function .size() return the size of our ArrayList. we catch the return integer valu in a variable
       System.out.println("size of my ArrayList is " + size);

//......................How to apply loop on ArrayList .............................................................
System.out.println("all value stord in AarayList is fetch by  .get() function  ");
for(int i=0;i<=list1.size()-1;i++){  //list1.size() ArrayList ki Size ko dega  jabki (Array ke hum array.length ka use kerte thai)
 
    System.out.print(" "+list1.get(i));  //wahi list1.get(i) ArrayList ki  ek ek value ko print ker ke dega 
                                      //jabki (array ke andar kewal array[i] se value aa jati thi )
}
System.out.println();//use for next line
//.........................................Shorting the element ....................................
        Collections.sort(list1);  //Collection 
        System.out.println("our ArrayList is Sorted");
        System.out.println(list1);
}

}