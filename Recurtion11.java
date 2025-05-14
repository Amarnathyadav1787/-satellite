class Recurtion11{

   public static boolean isShorted(int array[],int idx){

if(idx==array.length-1){
    return true;
}
    if(array[idx]<array[idx+1]){                  //chae step by step next one 
        return  isShorted(array,idx+1);           //for taking comprestion with next term

       }

else{

    return false;
}

 }


    public static void main(String args[]){

  int array[] = {1,5,6};
  System.out.println(isShorted(array,0));

    }
}