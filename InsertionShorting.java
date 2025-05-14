class InsertionShorting{



    public static void arrayPrint(int array[]){
    for(int i=0;i<array.length;i++){
  System.out.print(array[i]);
}

}


 public static void main(String args[]){

      int array[]={7,8,3,1,2};
for(int i=1;i<array.length;i++){   // we run programm form index 1 because we assum that unstrted array range is from 1 to array.length
                                   // at zero idex we assum it sorted and outter loop perform opration on unshortted array list
    int current = array[i];        //array[i] is current array valu and at enitial it is equal to 8  
    int j= i-1; 
    while(j>=0 && current < array[j]){
             array[j+1]=array[j];
             j--;
    }

    array[j + 1] = current;

}

     arrayPrint(array);
 }


}