
static class Node{
  int data;
  Node next;
  public Node(int data){

    this.data=data;
    this.next=null;
  }
}


static class L30Stack{
    public static Node head; //here head is  node type variable
   //..............................................isEmpty function.................................................................
    public static boolean isEmpty(){
    return head==null;   //if equal then return true if not equal the return 
 }
}
//..............................................pushFunction..............................................................................    
public static void push(int data){
    Node newNode = new Node( data);
    if(isEmpty()){
     head = newNode;
     return; 
    }
     newNode.next=head;
     head=newNode;
    }
//.........................................popfunction..................................................................................
public static int pop(){
    if(isEmpty()){
        return -1;
    }
int top =head.data;
head=head.next;
retuen top;
}

public static int peek(){

    if(isEmpty){
        return -1;
    }
    return head.data;
}
public static void main (String args[]){
  Stack s =new Stack();
  s.push(1);
  s.push(2);
  s.push(3);
  s.push(4;)

}

}