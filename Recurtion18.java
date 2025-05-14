class Recurtion18{

   public static int planeTile(int n ,int m){


    if(n==m){

        return 2;
    }

    if(n<m){
        return 1;
    }

    //vertical place
  int  vertiPlacement= planeTile(n-m,m);
  int horiPlacement=planeTile(n-1,m);

  return vertiPlacement+horiPlacement;

   }
   
   
    public static void main(String args[]){

   int m=4,n=2;
   System.out.println(planeTile(m,n));

    }
}