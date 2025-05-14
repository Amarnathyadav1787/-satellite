//..............................code for .defined for single LinkedList...................................................................
class ListNode{
int val;         //val namak veriable jiska data type int hai yani koi integer value ko stor ker rha hoga 
ListNode next;   //next namak veriable jiska data type ListNode hai koi node  stor ker rha hoga
ListNode(int val){

    this.val=val;
    this.next=null;
} 
}
//..................................................................................................................................
class L28Solution{
   
   public ListNode removeNthFromEnd(ListNode head,int n){
     if(head.next==null){    //corner case.
        return null;
    }
//........................................................................................................................................
      int size=0;             //calculate the size of LinkedList mannualy
      ListNode curr = head;  //creating a ListNode type variable stor the value of head
      while(curr!=null){     //fir head se surwat karege "while(end condition)"loop me dalker curr 1 -1 lagatar badhaker last tak 
      curr=curr.next;    //  pahuche ge jaise hi curr ki value null ke equal hogi hamara loop chalna band ker dega aur tab tak 
        size++;            // hamare LinkedList ki size ki value add hoker size namak veriable me stor ho chuki hogi
      }
      System.out.println();
     System.out.println("size of our Linked List is "+size);
//.........................................................................................................................................
     if(n==size){
return head.next;  
     }

     int indexToSearch =size-n;
     ListNode prev =head;                  //again we assine curr node  value =head node value
     int i=1;                             //because we count position
     while(i<indexToSearch){
     prev=prev.next;
     i++;
     }
     prev.next=prev.next.next;
     return head;
    }

     //.........................method used to print linkedlist.........................................................
      public void printList(ListNode head){

        ListNode temp= head;
        while(temp!=null){
            System.out.print(temp.val+"--->");
            temp=temp.next;
        }
        System.out.print("null");
        }
        //...........................................main function....................................................
        public static void main(String args[]){   

        ListNode head= new ListNode(1); //stor value in linkedList
        head.next=new ListNode(2);     
        head.next.next =new ListNode(3);       
        head.next.next.next=new ListNode(4);       
        head.next.next.next.next=new ListNode(5);       
 
        L28Solution sol =new L28Solution();
        System.out.println("original list is --" );
        sol.printList(head);                // print given list


        int n=2; //put your question that you want to delet 2nd last number from LinkedList

        head=sol.removeNthFromEnd(head,n);

        System.out.println("your upadte linkedlist is after delete "+ n +"  position element from back side is" );
        sol.printList(head);



        }
      }
   
    