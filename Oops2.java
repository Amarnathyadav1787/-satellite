class Student{
      String name;             //object name
      int age;
    public void printInfo(){
     System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(String name,int age){
        this.name=name;    //(this.name) me name object ka nam hai jabki (= name ; ) me name  costrctor se pass value ko hold kerta hai
        this.age=age;

    }

}

public class Oops2{
   public static void main(String args[]){

       Student s1 = new Student("Amar",24);   //here 2 type of constrocter is used call parametarised constructor 
                                                       //that is  new Student("Amar",24);
    s1.printInfo();
}

}