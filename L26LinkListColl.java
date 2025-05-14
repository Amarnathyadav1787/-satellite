
import java.util.*;      //we impoert collection freamwork and use hear to make optimised code


class L26LinkListColl{

//...........................................reverseIterate() function........................................................................
    public void reverseIterate(){

        if(head==null||head.next==null){
            return;
        }
      Node  prevNode=head;
      Node currNode=head.next;
      while(currNode!=null){
    Node NextNode = currNode.next;
    currNode.next= prevNode;
    prevNode = currNode;
    currNode = nextNode;
    }
    head.next=null;
    head=prevNode;
    
      }
      //........................make a printListFunction to print our coustom revers linkedList..............
public void printList(){
    Node currNode=head;
    while(currNode!=null){
System.out.println(currNode.data+"---->");
currNode=currNode.next;
  }
  System.out.println("null");
    }
    
//...........................................main function........................................................................
public static void main(String args[]){

    
//.....................creating object of LinkedList class which is present in collection freamwork pakaj in import java.util.*;.............
LinkedList<String> list = new LinkedList<String>(); //after creating the object as list we access fuction/method or properties/data
                                                   //of LinkedList class 
 
  //.......................use addFrist() function ... of LinkedList class which is present in collection freamwork.............                                                
 list.addFirst("Amar");
 list.addFirst("yadav");
 System.out.println(list);
//.......................use addLast() function ... of LinkedList class which is present in collection freamwork............
list.addLast("good");
list.addLast("boy");
System.out.println(list);

//.......................use add() function ... of LinkedList class which is present in collection freamwork...................
list.add("hai");
System.out.println(list); //add() function hamesa last me add kerta hai 

//.......................use size() function ... of LinkedList class which is present in collection freamwork..................
System.out.println("current size of your LinkedList is "+list.size());

//.......................use get(itorater) function ... of LinkedList class which is present in collection freamwork............
for(int i=0;i<=list.size()-1;i++){     //eska use ek ek charecter string (word ko ) linkedList ae nikalker print karane ke liya 
System.out.print(list.get(i)+"--->");//kiya ja rha hai .

}
System.out.println("null");  // loop exit ho jayega kyo ki null loop ki exit condition hai esliye null ko alag se print kra lege


//.......................use removeFrist function ... of LinkedList class which is present in collection freamwork..................
list.removeFirst();
System.out.println("remove from first  "+list);
//.......................use removeLast function ... of LinkedList class which is present in collection freamwork..................
list.removeLast();
System.out.println("remove from last   "+list);
//.......................use remove(itrator) function ... of LinkedList class which is present in collection freamwork............
list.remove(0);
System.out.println("remmove from index number 0  "+list);
L26LinkListColl listmyclass = new L26LinkListColl();
listmyclass.printList();

}
}