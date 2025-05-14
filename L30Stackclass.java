import java.util.*;
class L30Stackclass{


 public static void pushAtBottom(int data,Stack<Integer> s){    //pushAtBottom outer function
        if(s.isEmpty()){
            s.push(data) ;
            return;}

      int top = s.pop();                                    
      pushAtBottom(data,s);            //pushAtBottom inner funtion jab inner ka kam pura ho jayega eske bad outer function chalega
      s.push(top);                              
      }

public static void main(String args[]){

Stack<Integer> s =new Stack<>();
s.push(1); //push(),peek(),pop() function present in java collection freamwork
s.push(2); 
s.push(3);
int data=4;
pushAtBottom(data,s);


while(!s.isEmpty()){

    System.out.println(s.peek());
    s.pop();
}
    

}
    
}