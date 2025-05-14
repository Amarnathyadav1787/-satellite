class ListNode{
  int val;
  ListNode next;

  ListNode(int val){
  this.val=val;
  this.next=null;
 }
}
class L29Solutionp{
public ListNode reverse(ListNode head){
ListNode prev =null; //we assine value as prev node equla to null
ListNode curr = head;  //curr node equla to head
while( curr!= null){
 ListNode next =curr.next;    //we put location of node (2-->....!) in next type variable if LinkedList is(1-->2--->3-->4--->5-->null)
 curr.next = prev;            //after putting the value of curr.next we assine it prev=null and now connection is break
 prev=curr;                  //now value update for next node add into 1 node like null<---1<----2  etc.
 curr=next;
}
return prev;
}

public ListNode findMiddle(ListNode head){
  ListNode hare=head;
  ListNode turtle=head;
  while(hare.next!=null && hare.next.next!=null){
  hare=hare.next.next;   //hare do kadam chalega LinkedLst me aur turtil 1 kadam yahi ki jeb hare duguni speed se chal rha hai esliye
  turtle=turtle.next;   //jeb hare linkedlist ke last node ya loop ki base condition pe hoga tab turtil aadha duri pr hoga 
 }                    //eske turant bad while loop band hoga aur turtil ya to mid me hoga ya first half ke last node pe hoga
 return turtle;      //fir esi ko hum return kra dege 

}

public boolean isPalindrome(ListNode head){
  if(head==null||head.next==null){   //ya to list empty hai ya list me koi element nhi hai
  return true;
  }

  ListNode middle= findMiddle(head);  //1st half ka end
  ListNode secHalfStart = reverse(middle.next);  //LinkedList (1-->2--->2-->1->null)--->half part (2-->1-->null)revers it--->(null<--1<--2)
                                                 //it mean that strating node of second half point null (null---1)
    ListNode firstHalfStart=head;  //.use logic and compare 1st half and revers second half of LinkedList
    while(secHalfStart!=null){
     if(firstHalfStart.val!=secHalfStart.val){    
       return false;
      }
      firstHalfStart=firstHalfStart.next;
      secHalfStart= secHalfStart.next;
    }
    return true;
}
//print the value........................................................................................
public void printList(ListNode head){
ListNode temp =head;
while(temp!=null){
  System.out.print(temp.val+"---->");
  temp=temp.next;
}
System.out.println("null");

}



public static void main(String args[]){

 ListNode node1=new ListNode(1);    //we insert all node in Linked list 
 ListNode node2 =new ListNode(2);
 ListNode node3 = new ListNode(2);
 ListNode node4 = new ListNode(1);
ListNode head=node1; //we make node1 as a head

node1.next=node2; //connect all node with each outher
node2.next=node3;
node3.next=node4;
L29Solutionp sol =new L29Solutionp(); 
System.out.println("Your given  LinkedList is --> ");
sol.printList(head);
 System.out.println();
 boolean result= sol.isPalindrome(head);
 System.out.println(result);

 if (result==true){
  System.out.println("Your Given LinkedList is follow Palindrome");
 }
 if(result==false)
 System.out.println("your gevin LinkedList is Not palindrome");
}
}