import java.util.*;

public class StackClass{
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

//..............................................pushFunction..............................................................................    
public static void push(int data){
    Node newNode = new Node( data);
    if(isEmpty()){
     head = newNode;  //नीचे का linking वाला code नहीं चलेगा, क्योंकि Stack खाली था और पहला element add हो चुका है।
     return;           //यहां method को रोक दिया जाता है।
    }
     newNode.next=head; //
     head=newNode;              // yani ki pahale bar jo value put hogi usme to null hoga aur usko empty condition me pass kra ke head bna
     // dege fir agli jo value aayegi  usko newNode bna dege aur usko newNode.next=head ;se head ki taraf point kra dege entha hi nhi
     // karne ke turant bad hi  ab usko head bna dege aur newNode me fir jo value aayegi usko fir newNode.next=head; se fir head ki  taraf 
     //point kerwa dege ye prakiya bar bar chalti rahegi jab tak in input dete rahegen
    }                     // ye method value dalne ka kam ker rha hai stak ke andar (4->3->2->1->null)
//.........................................popfunction..................................................................................
public static int pop(){
    if(isEmpty()){
        return -1;    //use to chake stak is empty or not if empty for logic is that return -negative value
    }
int top =head.data;
head=head.next;
return top;
}
//..........................................peek function..............................................................................
public static int peek(){

    if(isEmpty()){
        return -1;
    }
    return head.data;
}
}

public static void main (String args[]){
  L30Stack s =new L30Stack();
  s.push(1);
  s.push(2);
  s.push(3);
  s.push(4);    //satk me value ko dalne ka kam kerta hai

  while(!s.isEmpty()){
   System.out.println(s.peek());  //value ko dikhane ka kam kerta hai
   System.out.println();
   s.pop();                //sath ke sath value ko delet kerha rahata hai taki agla number stak se pic ho sake
  }

  System.out.println("now stack is empty"+s.peek());//pura loop chanle ke bad pura stak khali ab fir pic kerne ke liye call di aur print karana chaha to 
                               //to output -1 aayega jo java ki andar batata hai ki stack khali hai
}

}