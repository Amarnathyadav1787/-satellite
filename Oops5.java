class Shape{

System.out.println("Area  of trangle is ")

}


class Triangle extends Shape{
   public void area(int l,int b){

int area= 1/2*length*breath; 
System.out.println(area);

}

public class Oops5Inheri{

  public static void main(String args[]){

    Triangle t1 = new Triangle();
    t1.area(5,10);

    }
}