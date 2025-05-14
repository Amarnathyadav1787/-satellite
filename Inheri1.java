class Shape{
String colour; //  properties of this class ready to share in Trangle class

}

class Trangle extends Shape{
   
    public void printInfo(){
    System.out.println(this.colour);
}

}

public class Inheri1{

    public static void main (String args[]){
    Trangle t1 = new Trangle();
    t1.colour="Red";
    t1.printInfo();

    }
}