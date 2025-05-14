class Student{
      String name;
      int age;
    public void printInfo(){

        System.out.println(this.name);
        System.out.println(this.age);
     }

        Student(Student s2){
         this.name=s2.name;
         this.age=s2.age; 
          }
      Student(){

      }//default constrcutor ko nhi lega kyo ki ek pahale se perametric constrocter Student(Student s2) humne bna ke rakha hai 
}                  //esliye default bhi banana padega ager humko line no 22 ka use kerna hai tab

public class Oops3{

   public static void main(String args[]){
     Student s1 = new Student();
     s1.name="Amar";
     s1.age=30;

     Student s2 = new Student(s1);
     s2.printInfo();
 }

}