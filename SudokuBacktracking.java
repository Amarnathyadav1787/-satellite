import java.util.*;

class SudokuBacktracking{
//...........................................................isSafe function Body is below
public boolean isSafe(char[][] board,int row,int col,int number){

           for(int i=0;i<board.length;i++){            //chake the condition in vertical way suppose a (number=5) then it chake that 
           if(board[i][col]==(char)(number+'0')){     ///any other 5 is present or not in vertical col if present return false
            return false;
        }
           if(board[row][i]==(char)(number+'0')){      //similar chake in horijontal condition
            return false;
           } }
           //chaking grid condition  find out starting point equl to r/3*3 or c?3*3
             int sr =(row/3)*3;
             int sc =(col/3)*3; 
         
             for(int i=sr;i<sr+3;i++){         //we move inside grid each cell by two loop one is outer loop one is inner
                for(int j=sc;j<sc+3;j++){     //and chake if number is present then it return false
                 if(board[i][j]==(char)(number+'0')){
                    return false;
                 }

                }
             }
             return true;
           }
           

//.................................................................helper function body
    public boolean helper(char[][] board,int row,int col) { 
        if(row==board.length)  {       //base case
            return true;}             //recution function
       int nrow=0;
       int ncol=0;
       if(col !=board.length-1){    //because indexing start from 0 so valu of last coloum is equql to board.length-1 ,boord lenght is count 
           nrow=row;                //length from 1 so we less 1 in total to reach last coloun index
           ncol =col+1;
       }
        else{
            nrow=row+1;
            ncol=0;
        }

//.........................................now we chake the sudoku if number is present then move forword cell and if number is not present 
                                          //then put valu from (1-9)in the cell
    if(board[row][col] != '.'){

return helper(board,nrow,ncol);   // valu is present go forword to new cell
       }
        else {
        for(int i=1;i<=9;i++){
            if(isSafe(board,row,col,i)){   //cheke karega ki kis number ko bithana shi rahega

           board[row][col]=(char)(i+'0');   // if i number is valid put it on board i integer hai aur hamara board char type hai
        if(helper(board,nrow,ncol)) {              //esliye i me'0' ko add ker ke type cost ker diya aur ab i bhi char me badal gya
             return true;
                          }
             else{
              board[row][col] = '.';      //use it for back tracking if number is not satisfied number then move back by remove inserted
             }                           //number and put '.'
      
        }                                   
        }
}
return false;
}
//.....................................................starting function
public void solveSudoku(char[][] board){
   helper(board,0,0);                          //working start from 1st cell it is 0,0

}

//............print function to print the value...................................................
  public static void printBoard(char[][] board ){

    for(int i=0;i<board.length;i++){
       for(int j=0;j<board.length;j++){

        System.out.print(board[i][j]+" ");
       }
       System.out.println();
  }
}

//..............................................................................................................main function  

public static void main(String args[]){


    SudokuBacktracking solver =new SudokuBacktracking();// SudokuBacktrackin class ka nya object bnta hai jisko solver namak refrance me
                  // kaid kiya jata hai ab es refrance ki madad se hum SudokuBacktracking class ke method ko call ker sakte hai 
    char[][] board ={                            //..................................taking input
   
   {'.','.','1','3','.','2','.','.','.'},
   {'.','.','3','.','.','7','.','4','5'},
   {'.','.','7','.','.','.','.','.','9'},
   {'.','.','6','5','.','.','.','7','.'},
   {'2','.','.','.','.','.','.','.','1'},
   {'.','9','.','.','.','1','4','.','.'},
   {'5','.','.','.','.','.','9','.','.'},
   {'6','1','.','2','.','.','8','.','.'},
   {'.','.','.','9','.','8','5','.','.'}


    };

    System.out.println("your unsolved Puzzel is that ");
    printBoard(board);
   solver.solveSudoku(board); //ab kamal ho gya jo SudocuBacktracking class ka object bnaye thai jisko humne ek solver namak refrance
   //me hold kiya tha ab usi ki madad se SudokuBacktracking ke method .solveSudoku() ko call ker lege aur apne given 2d array type board
   //ko esme pass ker dege fir kya wo pura run hoga aur return me solved puzzel humko mil jayegi 
   System.out.println("solved puzzel is given below ");
   printBoard(board);  //jase ji solved puzzel hamare board me update hogi hum usko print function me dalker print kra dege

}



}