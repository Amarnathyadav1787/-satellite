class MergeShort{

//.....................................................................conqure function..........................................
    public static void conquer(int array[],int si,int mid,int ei){
     int mergearray[] = new int[ei-si+1];//create an new array and collect all divided element in sorting order after that replace it with 
                                  //our original array and value stor we make same size of old array by using si=si+1
     int idx1=si; //starting index value for 1st half part of array is si
     int idx2=mid+1;//starting index value for second half part of array is mid+1
     int x=0;//starting index value for merge array is 0

   while(idx1<=mid && idx2<=ei){     //both codion are true run for index then run while loop 
  if(array[idx1]<=array[idx2]){    //1 value is small and 2nd value is large then it is all ready shorted we put it on mergearray 
    mergearray[x++]=array[idx1++];      //put the merged value on merge array which is point out from old array 
                   // x++;   idx1++;   we use it inside the upper command  after putting the merdged value we increased the value by one.
 }
 else{
    mergearray[x++]=array[idx2++];
}
}
    while(idx1<=mid){
    mergearray[x++]=array[idx1++];
   }                              //adove while loop is sufficient for a array but for rest or extra sorted element arrange this 
                                       //element in divided array 
     while (idx2<=ei) {
    mergearray[x++]=array[idx2++];
    
  }
   for(int i=0,j=0;i<mergearray.length;i++,j++){
      
     array[si+i]=mergearray[i];

   }

    }

//.................................................................divide function..................................................
   public static void divide(int array[],int si,int ei ){
   
    if(si>=ei){             //jeb frist bhi wahi rahega aur last bhi wahi tab sare element alag alag tut chuke hoge 
        return;
    }
    int mid = si+(ei-si)/2;  //(si+ei)/2; for mid value we not use this because it is not applicable for large no fo integer value
                           //array is {6,3,9,5,2,8}
   divide(array,si,mid);    //break starting half part array={6,3,9}  using recurtion function calling started agai and again up to base codition
  divide(array,mid+1,ei);   // break rest half part array={528}
  
  conquer(array,si,mid,ei);  //now we start 2nd setp that is collect all element in array after shorting by applying condition
  
}

//............................................................main function..................................................

    public static void main(String args[]){
        
        int array[] = {5,6,7,2,1,0,10};
        int n=array.length;
        System.out.println("your given address is ");
          for(int i=0;i<n-1;i++){
             System.out.print(array[i]+" ");
          }
          System.out.println();
        divide(array,0,n-1);

        //now responce comes from divide function we and aur shorted array is update now we print our shorted array 
        System.out.println("Merge shorted array is ");
        for(int i=0;i<array.length;i++){
          
           System.out.print(array[i]+" ");          

        }
        System.out.println();
    }


}