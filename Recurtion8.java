class Recurtion8{


public static void towerHanoi(int n,String scr,String helper,String dest){

if(n==1){

System.out.println("transfer disk "+ n +"  from "+scr+"  to "+dest);
return;
}
towerHanoi(n-1,scr,dest,helper); 
System.out.println("Trasfer "+ n + "  disk from  "+scr+"  to  "+dest);


towerHanoi(n-1,helper,scr,dest);


}





    public static void main(String args[]){

  int n=3;
  towerHanoi(n,"S","H","D");

    }
} 