import java.util.*;

class Array2D{


    public static void main(String args[]){

  System.out.println("Enter number of row in Array");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
   System.out.println("Enter number of colum in Array");
   
        int col = sc.nextInt();

        int [][]matrixArray = new int [row][col];
        

        //input loop 
        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){

          matrixArray[i][j]=sc.nextInt();

            } 
            
        }

// search number x in 2d array
System.out.println("Enter the numner to find locatoin index");
        int x = sc.nextInt();
             //output loops
             
             for(int i=0;i<row;i++){

                for (int j=0;j<col;j++){
                  //System.out.println("your input valu in matrix form is");
                  //System.out.print(matrixArray[i][j]+" ");
                       if( matrixArray[i][j]==x){

                        System.out.println("Number "+x+" is present on row index "+i+"  and  "+"colum index = "+j);
                       }
                     
                       else System.out.println("Number is not found in This array");
                break;
                }
          

             }

        }


    }
