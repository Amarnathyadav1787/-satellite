import java.util.*;
class L31QueueY{
    
    static class Queue{
    static int arr[];            //array where number is stor
    static int size;            //give the size of aaray list
    static int rear=-1;        //aarey list  ka aakhiri element hota jeb kuch nhi hota hai tab 

    Queue(int n){
    arr = new int[n];
    this.size=n;
    }
    public static boolean isEmpty(){
     return rear==-1;
    }
    //..................................................//enqeueu opreatoin..........................................................
    public static void add(int data){
       if(rear==size-1){
        System.out.println("full queue");
        return;
    }
      rear++;
      arr[rear]=data;
      }
      //.................................................deqeueu opration...........................................................

public static int remove(){
if(isEmpty()){
    System.out.println("Queue is empty");
    return-1;
}

  int front =  arr[0];
  for(int i=0;i<rear;i++){
   arr[i]=arr[i+1];
}
rear--;
return front;
}

//........................................................ ..peek opration...........................................................................

public static int peek(){
if(isEmpty()){
    System.out.println("empty queue");
    return -1;
}
return arr[0];

}
    }

    
    public static void main(String args[]){
    Queue q =new Queue(3);
    q.add(1);
    q.add(2);
    q.add(3);

    while(!q.isEmpty()){
    System.out.println(q.peek());
    q.remove(); //eleent ko remove kerne ke liye eska prayog kiya jata h eska koi bahut special function nhi hota,jaise jaise index 
    //ya fron ya rear ki value kum kerte jate hai waise waies aaray list se number delet hota jata hai

    }

  
     

    }

}