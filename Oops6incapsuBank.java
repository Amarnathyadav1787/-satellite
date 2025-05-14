import Bank;
class Account {   //...........................................................Account class..............................

    public String name;       //public in front it is acesses from any class
    protected String email;   //itself package any one access but from another package only sub classes is access
    private String password;  //not access by outher class in same package or by outher package it access by only in its class(Account)


    public String getPassword(){   
return this.password;
}


public void setPassword(String pass){   //setter function is use to catch valu of password that is 1787anee in string type data type in 
                                       //veriable pass 
this.password=pass;                   // and now set this.password =pass (sc.passwor=1787anee)

}
}
public class  Oops6incapsuBank{

 public static void main(String args[]){

    Account ac =new Account();
    ac.name="Amar";
    ac.email="anee.yadav7@gmail.com";
 // ac.password="1787anee";     ..............  // it show error not access  because its private String type defined in Account class 
                                                   //to set and get password we use setter and geteer method like belo
    ac.setPassword("1787anee");
    System.out.println(ac.getPassword());   // print this.password value that is 1787anee value is periviosaly set by setter function

 }
}
