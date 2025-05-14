class QuickShort{

    //...............................................partition function.....................................................

    public static int partition(int array[],int low,int high){
      int pivot=array[high];
      int i=low-1;                // i is used to track hoe many element comes smaller than pivot number (asummed null represent low-1)
      for(int j=low;j<high;j++){
          if(array[j]<pivot){
            i++;
            //swap

            int temp=array[i];
            array[i]= array[j];
            array[j]= temp;     //swapping completed
          }

      }
       i++;// because we want empty space for pivot
       int temp = array[i];
       array[i]=pivot;
       array[high]=temp; 
       return i;

    }
//...............................................quickShort function...............................................
  public static void quickShort(int array[],int low,int high){
  if(low<high){                       

    int pidx = partition(array,low,high);  //ye function humko element ko arrange ker ke dega aur pivit ka index no return karega
   
quickShort(array,low,pidx-1);  //  pivit no se pahale ka part short hoga 
quickShort(array,pidx+1,high);  //pivit no ke bad wala part short hoga 
  }
  }


    //....................................................main function................................................................
    public static void main(String args[]){

        int array[]={3,6,9,5,2,8};
        int n= array.length;
        System.out.println("YOUR UNSORTED ARRAY IS ");
       for(int i=0;i<n;i++){
        System.out.print(array[i]+" ");
       }
       System.err.println();
 
       quickShort(array,0,n-1); //return the sorted valu in same array by sweeping tecmiquse using help of recurtion in quickShort 
                                     //function and partition and swaaping in another function that is partition and return a update array

//print 


System.out.println("YOUR SORTED ARRAY IS ");
  for(int i=0;i<n;i++){
    System.out.print(array[i]+" ");
  }
 System.out.println();
    }
}