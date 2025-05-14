import java.util.*;

class BackTraking2Chess{

    public void helper(char [][] board, List<List<String>> allBoard,int col ){

        public boolean isSafe(int row ,int col ,char[][] board){

        //horizontal chake
        for(int j=0;j<board.length;j++){
          if(board[row][j]=='Q'){
            return False;
            }
       //vertical
             for(int i=0;i<board.lenght;j++){
             if(board[i][col]=='Q'){

        return false;
    }
//upper left
    for(int r=0)

}

        }


        }

        if(col==board.lenght){

            saveBoard(board,allBoard);
            return;
        }
  for(int row=0;row<board.length;i++){

       if(isSafe(row,col,board)){
            board[row][col] ='Q';
            helper(board,allBoard,col+1);
            bosrd[row][col]='.';
       }
  }

    }
    
 public List<List<String>> solveNQueens(int n){
    List<List<String>> allBoard = new ArrayList<>();
    char [][] board = new board[n][n]; 

    helper(board,allBoard,0);

    }

}