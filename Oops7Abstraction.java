
abstract class Animal{   
    Animal(){      //animal ka constructer 

        System.out.println("We are creating a new animal");
            }
    
    
                            //abstrac class function/method or properties/data used by every derived class
                           // so we used  gernal properties/data ,function/method like walking function,colour etc whic is present in
                          // all animal like hen and horse so hen and horse class(drived class) is use animal class (abstract /base)
abstract void  walk();   //abstract method
public void eat(){       //and non abstarct method
    System.out.println("animal always eat and grow their body");
}
}

class Horse extends Animal{
   Horse(){
System.out.println("creating a object of horse ");
}

    public void walk(){

        System.out.println("walk on 4 leg");
    }
}

class Hen extends Animal{
   public void walk(){
    System.out.println("walk on 2  leg");
   }

}
public class Oops7Abstraction{

    public static void main(String args[]){

        Horse ho =new Horse();
        ho.walk();
        ho.eat();

        Hen he = new Hen();
        he.walk();
       he.eat();

       // Animal an= new Animal();//...................output of these two line is " Cannot instantiate the type Animal"
        //an.walk();........eska matlab ye hai ki animal ek abstract class hai eska object nhi ban sakta ye blue print type jaisa hai 
    }   //it is runtime error kyo ki compilation m koi red line show nhi hogi entelije me run kerne ke bad ye error aa rhi hai 
    
}