class Student {
String name;
static String school;
public static void changeSchool(){

    school="new school";
}
  
}
public class Oops8abstract{
public static void main (String args[]){
Student.school="ABC";
Student su = new Student();
su.name="Tony";
System.out.println(su.school);

}
}