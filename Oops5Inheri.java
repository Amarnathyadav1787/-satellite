class Shape{                  //........................base class
public void area(){
System.out.println("Area  of shape is");
}
}

class Triangle extends Shape{      //  ..............(1)..jeb ek base class ko ek drive class inherit kare to single level inheritance
   public void area(int l,int h){

double area= 0.5*l*h; 
System.out.println(area);

}}

 class EquilateralTringal extends Triangle{    //......(2).....no any mehod present in this class but it extend ..
                                              //.........public void area(int l,int h) function from Triangle class 
                                              //  and public void area() function Shape class se Tringal me inharit ki gayi hai fir
               //Tringal class se Equilateral class me inherit ki gayi hai esliye esko multi level inharitance bolte hai........
  

 }


 class Circle extends Shape {  //.......................(3)...base class Shape ko hamari Circle aur Triangle Class dono 
  public void  area(int r){    //direct extend ker rhi hai esiye esko  ...hirarchial level inheritance....bolte hai
   double area = 3.14*r*r;
   System.out.println(area);

  }

 }
public class Oops5Inheri{

  public static void main(String args[]){
    
    Triangle t1 = new Triangle();
   t1.area();                    //we call it for print inharitance function that output is "Area of shape is"
    t1.area(5,10);

    EquilateralTringal eq = new EquilateralTringal();
    eq.area();
    eq.area(10,20);
 
      Circle cr = new Circle();
      cr.area();
      cr.area(5);
      
   }
}