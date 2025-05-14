class Student{
    String name;
    int age;
//.......................................printInfo().....three function with same name but used for different different perpose call polymorphism
    public void printInfo(String name){

        System.out.println(name);
    }
 
        public void printInfo(int age){  //..  ........printinfo()..function same but perpose different
        System.out.println(age);
        }
       public void printInfo(String name ,int age){//..........printinfo().......function same but perpose different 
                                                     //.....uper ek hi function ko 3 bar alag alag perpose ke liye use liya gya hai
        System.out.println(name+" "+age);             //....esliye esko polymorphism bolege
        
   }
}
    public class Oops4{

    public static void main(String args[]){
     Student s1 = new Student();
     s1.name="Amar";
     s1.age=24;
      
      s1.printInfo(s1.age);
      s1.printInfo(s1.name,s1.age);
      s1.printInfo(s1.name);
    }

} 