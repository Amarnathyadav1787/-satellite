import org.w3c.dom.Node;

class L26LinkList{
   
  //................................................................siz calculate........................... 
   private int size; //private variable always access in his class only .
   L26LinkList(){    //we make a construtor of our class
   this.size=0;
//...........................................................................................................................
   }

        Node head;       //यहाँ head एक Node टाइप का वेरिएबल है जो लिंक्ड लिस्ट के पहले (first) नोड को दर्शाता है।  
                         //हमने एक वेरिएबल head बनाया है जिसका डेटा टाइप Node है। यानी यह सिर्फ उसी चीज़ को स्टोर कर सकता है जो Node टाइप की हो।
                         //जब हम Linked List (लिंक्ड लिस्ट) की बात करते हैं, तो उसमें हर एक "Node" (नोड) एक छोटा सा डिब्बा (Box) होता है जिसमें दो चीज़ें होती हैं:
                         //डेटा (Data) – जो हम स्टोर करना चाहते हैं अगले नोड का पता (Next) – यानी वो Memory Location जहाँ अगला नोड रखा गया है
                        //ki jankari node ke pass hoti hai 
    
    class Node {
     String data;  //stor data in the node यह वेरिएबल नोड में डेटा (सूचना) रखने के लिए है। abhi ye data charecter me lega esliye string type ka hai
        Node next; //यह वेरिएबल अगले नोड का पता (address) रखता है यानी लिंक बनाता है।

     Node(String data){  // यह नोड का कंस्ट्रक्टर है। जब भी नया नोड बनेगा, इसमें डेटा स्टोर होगा और next की वैल्यू null होगी 
      this.data=data;    //(क्योंकि शुरू में पता नहीं होता कि आगे क्या है)। bad me next node ka addres usi me stor  hoga .
      this.next=null;
      size++;
     }
    }
//.........................................add opration in LinkedList(add node from 1st in LinkedList)........................
   public void addFirst(String data){  // यह method एक नोड को लिंक्ड लिस्ट की शुरुआत में जोड़ता है।
    Node newNode = new Node(data);     //नया नोड बन रहा है जिसमें यूज़र से आया हुआ डेटा रखा जाएगा।
    if(head==null){ //.................अगर लिस्ट खाली है (head null है), तो नया नोड ही head बन जाएगा।
       head=newNode;
       return;
    }

    newNode.next=head;//......अगर पहले से कुछ है, तो नया नोड head को point करेगा और फिर head को अपडेट कर देंगे ताकि वो नया नोड बन जाए।
    head=newNode;
   }

//............................................add opration in LinkedList(add node from last in LinkedList)........................
public void addLast(String data){   //यह method एक नोड को लिंक्ड लिस्ट के अंत में जोड़ता है।
   Node newNode = new Node(data);    
   if(head==null){      //अगर लिस्ट खाली है, तो नया नोड head बन जाएगा। 
    head=newNode;
    return;
   }
   Node currNode = head;   //👉 यहाँ हम लूप चला रहे हैं ताकि लिस्ट के आखिरी नोड तक पहुँचा जा सके। currNode me head Node ki valu stor kra ke
   while(currNode.next!=null){  //suru karege aur aage ke sare node judte chale jayege jb last node ki badri aayegi to wo null hoga
                                //uske pass data hoga but address null hoga jiski wajay se wo loop ki condition follow nhi karega aur 
                                //loop stop ho jayega
   currNode=currNode.next;     //ab current node ki valu ko next node ki help se bdhayege jo pahale hi while loop ki wajay se ruki thi 
   }                       //fir us node pe newNode yani hamara aakhiri node aa jayega 
   currNode.next=newNode;//अब आखिरी नोड का next नया नोड बन गया यानी नया नोड आखिर में जुड़ गया।
   //अब newNode object के अंदर ये दो चीज़ें होंगी:newNode.data = "aakhri value" aur newNode.next = null (by default constructor में null set किया था)


   } 

   //........................................................print the value...............................................................................
   public void printList(){
    if(head==null){
        System.out.println("list is empty");
        return;
    } 
   Node currNode = head;
   while(currNode!=null){
    System.out.print(currNode.data+"--->");
    currNode =currNode.next;
   
   }
   System.out.println("NULL");
   }

   //.............................................deleteFrist.....................................................
   public void deleteFirst(){
        
      if(head==null){        //called corner case if arrayList is empty
         System.out.println("the Linkedlist is empty");
         return;
      }
      size--;//we not written it below because we 
         head=head.next; //we make head =head.next kyo ki head delete hone wala hai fir koi to string ka head hona chahiye
      }                  //now old head valu is behave like garbej value
       
      //.............................................deletLast function......................................................
      public void deleteLast(){
       if(head==null){
        System.out.println("LinkedList is empty");
        return;
       }
       size--;
      if(head.next==null){//.......corner case if only one element is present on Linkedlist
       head=null;
       return;
       }
       Node secondLast = head;
       Node lastNode =head.next;
       while(lastNode.next!=null){
        secondLast=secondLast.next;
        lastNode=lastNode.next;
       }
        secondLast.next=null; // second last  Node ke next me  null stor kerwa dege jiski wajay second last element null ko point kerne 
                                  //lagega aur last position ka sampark khatam ho jayega jo pahale kabhi null ko point kerta tha 
                              //aur es tarah se string ka last element delet ho jayega  
       }


       //...............................size function..............................................................

     public int getSize(){
      return size;

       }
//........................................revers LinkedList..by iterator method................................................
       public void reverseIterate(){

         if(head==null||head.next==null){
             return;
         }
       Node  prevNode=head;
       Node currNode=head.next;
       while(currNode!=null){
     Node nextNode = currNode.next;
     currNode.next= prevNode;
     prevNode = currNode;
     currNode = nextNode;
     }
     head.next=null;
     head=prevNode;
     
       }

       //..........................reveers LinkedList....by recurtion Method.......................

       public Node reversRecursive(Node head){
          if(head==null||head.next==null){   //base case
          return head;
          }

         Node newHead  =  reversRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;

       }
  // ..............................................main function.......................................................
    public static void main(String args[]){
    
    L26LinkList list = new L26LinkList(); //linklist bnane ke liye humko apni hi class ka object bnana hota hai 
    list.addFirst("a");
    list.addFirst("is");
    list.printList();

    list.addLast("List");
    list.printList();
    System.out.println("present time size of LinkList is " +list.getSize());
    list.addFirst("this");
    list.printList();

    System.out.println();
    System.out.println("LinkedList Revers by Iterator method");
    list.reverseIterate();
    list.printList();

    System.out.println();
    System.out.println("LinkedList Revers by Recrtion Method ");
    list.head = list.reversRecursive(list.head);
    list.printList();


    list.deleteFirst();
    list.printList();

    list.deleteLast();
    list.printList();
   
   System.out.println("present time size of linkedList size is  "+ list.getSize());
}
} 