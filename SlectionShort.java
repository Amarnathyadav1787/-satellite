class SlectionShort{
   public static void printArray(int array[]){
    
    for(int i=0;i<array.length;i++){
     System.out.println(array[i]);

    }
   }

    public static vooid main (String args[]){


       int  array[] = {7,8,3,2,1};
       
       for(int i=0;i<array.length-1;i++){
            int smallest = i;                  //we assumed that the 0th index is smallest number and start comperision with outher
       for(int j=i+1;j=array.length;j++){
           
          if(array[smallest]>array[j]){        //if valu of array[0]>array[1] (7>8) not trucondion 
              smallest=j;                     //again run array[0]>array[2]  (7>3)  true condition mean if loop on and smallest valu is update
               }                              //again run inner loop upto to array.length and at ture condion smallest valu is updated
                                      }                          //finally  (smallest=1)valu stor after running frist time of outer loop.
           //now swipe nmber 
         int temp = array[smallest];  //now we stor array[smallest] valu that is 1 in temp variable aftr stor array[smallest] is empty
         array[smallest] =array[i];//now in empty array[smallest] we put the valu of array[i] that is array[0]=7 now array[0] become empty
        array[i]=temp; //now empty array[i] that is array[0] is filled by temp valu that is 1 .
                       //same process is run again and again up to outer loop condition array.length-1 and all number shorted
       
        

       


       }

       printArray(array);
    }
}