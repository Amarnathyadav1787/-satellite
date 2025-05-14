import java.util.*;

class BackTraking2Chess{

   

        public boolean isSafe(int row ,int col ,char[][] board)
        {

                                               //horizontal chake()
        for(int j=0;j<board.length;j++){
          if(board[row][j]=='Q'){
            return false;
            }}
                                               //vertical chake
             for(int i=0;i<board.length;i++){
             if(board[i][col]=='Q'){
                return false;}
             }
                                                  //upper left
    
    for(int r=row,c=col;r>=0 && c>=0;r--,c--){

        if(board[r][c]=='Q'){

            return false;}
        }
 
                                                      //upper right
      for(int r=row,c=col; r<board.length && c>=0;r++,c--){
        if(board[r][c]=='Q'){
            return false;
        }
    }

                                                      // dowen left
        for(int r=row,c=col; r>=0 && c<board.length;r--,c++){

            if(board[r][c]=='Q'){
                return false;
            }
             }

                                                            //dowen right
                  
        for(int r=row,c =col;r<board.length && c<board.length;r++,c++)  {
            if(board[r][c]=='Q'){
              return false;
            } }                                    
           
            return true;
        }

        
        
        
   public void saveBoard(char[][] board,List<List<String>> allBoard){
     List<String> newBoard = new ArrayList<>();
            
for(int i=0;i<board.length;i++){
String row = "";
      for(int j=0;j<board.length;j++){
            if(board[i][j]=='Q'){
                   row +='Q';}
                   else{
                    row +='.';
                   } }
        newBoard.add(row);   //ye inner wala loop hai hai to ek single line chalega jisko single type array string me stor kra dege

                  }
                    allBoard.add(newBoard);
                }

        


        public void helper(char [][] board, List<List<String>> allBoard,int col ){
        
           if(col==board.length){
            saveBoard(board,allBoard);
            return;
        }
         for(int row=0;row<board.length;row++){
              if(isSafe(row,col,board)){
            board[row][col] ='Q';
            helper(board,allBoard,col+1);
            board[row][col]='.';
       }
  }

} 
    
 public List<List<String>> solveNQueens(int n){
    List<List<String>> allBoard = new ArrayList<>();
    char [][] board = new char[n][n]; 

    helper(board,allBoard,0);
    return allBoard;

    }


public static void main(String args[]){


  BackTraking2Chess solver = new BackTraking2Chess();
  int n =4; //for 4 queen problems
List<List<String>> solutions = solver.solveNQueens(n);
System.out.println("total solution:  "+solutions.size());

for(List<String> solution  :  solutions){

  for(String row : solution){

    System.out.println(row);
  }
  System.out.println();
}


}
}