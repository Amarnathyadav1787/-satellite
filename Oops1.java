

class Student{

    String name;
    int age;
    public  void printInfo(){             //it is not a static function/method so nat use static keyword

        System.out.println(this.name);   //this keyword is used to stor the object of current calling method from public class
        System.out.println(this.age);
        }
        
        Student(){                       //it is non parametraisedconstrctor because it not return any things so we not 
                                        //written it return data type it is present by default in class but when we create it specially 
                                       //and put valu it show result 

                                       //constructor always 1st call then rest properties & function
            System.out.println("constrctor is calling");
        }
    }

 public class Oops1{
     public static void main (String args[]){
      Student s1 = new Student();   //create object of Student class and s1 is object holding refrance
                                    //
      s1.name="Amar";       //call properties of student class
      s1.age=30;
      s1.printInfo();      //call method of student class
     

    }
 }


