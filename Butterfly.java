class Butterfly{

    public static void main(String args[]){
        int n =4;
        for(int i=1; i<=n;i++){
                //for star print
            for(int j=1;j<=i;j++){
              System.out.print("*");

            }

            int space =2*(n-i);
             //space print
        for(int j=1;j<=space;j++){
              System.out.print(" ");
            }

            for(int j=1;j<=i;j++){

                System.out.print("*");
            }
          System.out.println();
            //down part of butterfly

                                   // i>=1 jab tak condition true hogi chalega jaise hi condion fals hogi ruk jayega
                                  // jab tak i ki valu 1 ya usse jada rahegi chlega jaise i ki alu 1 se kum ya 1 ke equal hogi ruk jayega
            
        }
            
        for(int i=n; i>=1;i--){
            //for star print
        for(int j=1;j<=i;j++){
          System.out.print("*");

        }

        int space =2*(n-i);
         //space print
    for(int j=1;j<=space;j++){
          System.out.print(" ");
        }

        for(int j=1;j<=i;j++){

            System.out.print("*");
        }
      System.out.println();
        //down part of butterfly

                               // i>=1 jab tak condition true hogi chalega jaise hi condion fals hogi ruk jayega
                              // jab tak i ki valu 1 ya usse jada rahegi chlega jaise i ki alu 1 se kum ya 1 ke equal hogi ruk jayega
        
    }



    }
}