import java.util.ArrayList;

class Recurtion20{

  public static void printSubset(ArrayList<Integer>subset){
  for(int i=-0;i<subset.size();i++){
System.out.print(subset.get(i)+" ");
 }

System.out.println( );
  }
    public static void findSubset(int n ,ArrayList<Integer> subset){

      if(n==0){
    printSubset(subset);
      return;}


      //add numner

      subset.add(n);
      findSubset(n-1,subset);

      //not add
      subset.remove(subset.size()-1 );//we not directaly remove latter/number we remove it by idex number so we use this keys  
      findSubset(n-1,subset);

    }
public static void main(String args[]){


    int n=3;
    ArrayList<Integer> subset = new ArrayList<>();
     findSubset(n,subset);

 }

}