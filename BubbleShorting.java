class BubbleShorting {

public static void printArray(int array[]){
 
for(int i=0;i<array.length; i++){

    System.out.print( array[i]);
}

}

public static void main(String args[]){

   int array[] = {7,8,3,2,1};

   for(int i=0;i<array.length-1;i++){

   for(int j=0;j<array.length-1-i;j++) {
                if(array[j]>array[j+1]){
    //swap
           int temp = array[j];   //valu of i index is stor in temp variable then array[i] is empty
            array[j] = array[j+1]; // put array[j+1] valu into array[j] to perform swaping and now after puttin valu again array[j+1] become enpty
            array[j+1] = temp;
        }
    
    
        }


   }
  printArray(array);


}
}