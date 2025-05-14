
//........................................defined Node Class 
    class Node{

        int data;
        Node next;
        Node(int data){
        this.data=data;
        this.next=null;

        }
    }
 //.........................................................................................................................................   
    class L29InfiLoopLinkNode{

    public void printList(Node head){  //printFunction.........
        int size=0;
        Node curr=head;
        while(curr!=null){
         System.out.print(curr.data+"---->");
         curr=curr.next;
       //  size++;
       // System.out.println("while loop kitni taiji se chal rha hai hum esko cout ker ke mahsus ker sakte hai [LOOP METER DISPLAY]     "+size);
        }
        System.out.print("null");
    }

public boolean chakeLoopPresentorNot(Node head){

    Node turtle =head;
    Node hare=head;
    while(hare!=null && hare.next!=null){
       turtle=turtle.next;
       hare=hare.next.next;
      
       if(hare==turtle){    //dono ek dusare se tabhi milege jab cycle hogi linkedList me aur hum true return ker dege 
        return true;
    
    }
    }
    return false;
}



 public static void main(String args[]){
      
    Node node1=new Node(1);  //fill value in our empty LinkedList
    Node node2= new Node(2);
    Node node3= new Node(3);
    Node node4 =new Node(4);
    Node node5 = new Node(5);
                                  
    Node head =node4; //make a head node and assine the value of node1 in it

    node1.next=node2; //add node 1 to node 2
    node2.next=node3; //add node 2 to node 3
    node3.next=node4;//add node 3 to node 4
    node4.next=node5;//add node 4 to node 5
//..............................................now all node add with each outher and our linkedList is like 1->2->3->4->5  
    
    node5.next=node1; //it is condition of infinite loop now pointer of node 5 is point node2 and it is a close loop

    L29InfiLoopLinkNode sol =new L29InfiLoopLinkNode();
   sol.printList(head);  //esko run kerne pe infinite loop chalta huwa dikega .......

    boolean result=sol.chakeLoopPresentorNot(head);//esko run kerne pe ye btayega ki lop me infinite ki 
    System.out.println(result);  // condition hai ya nhi yes ya no me output dega
   
    if(result==true){
  System.out.println("cycle is present in LinkedList");
    }
    if(result==false){

        System.err.println("cycle is not present in LinkedList");
   }
}

}