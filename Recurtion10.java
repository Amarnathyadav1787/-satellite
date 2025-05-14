class Recurtion10{
public static int frist=-1;
public static int last=-1;
  public static void findOccurance(String str,int idx,char element){
if(idx==str.length()){
    System.out.println(frist);
    System.out.println(last);
    return;
}
char occuerChar = str.charAt(idx);

if(occuerChar==element){
   if(frist==-1){

    frist=idx;
}

else
last=idx;

}
  findOccurance(str,idx+1,element);
  }


    public static void main (String args[]){

   String str = "abaacdaefahhah";
   findOccurance(str,0,'a');

    }
}