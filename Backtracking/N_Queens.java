public class N_Queens {
   static void nQueens(char board[][],int row)
    {   
        if(row==board.length)
        {
            printQueen(board);
            return;
        }
        for(int j=0;j<board.length;j++)
        {   
            if(isSafe(board,row,j))
           {
            board[row][j]='Q';
            nQueens(board,row+1);
            board[row][j]='X';
          }
    }
    }
    static boolean isSafe(char board[][],int row,int j)
    { 
        for(int i=row-1;i>=0;i--)
        {
            if(board[i][j]=='Q')
            return false;
        }
        for(int i=row-1,k=j-1;i>=0&&k>=0;i--,k--)
        {
            if(board[i][k]=='Q')
            return false;
        }
       for(int i=row-1,k=j+1;i>=0&&k<=board.length-1;i--,k++)
       {
        if(board[i][k]=='Q')
        return false;
       }
        return true;


    }
    static void printQueen(char board[][])
    {   System.out.println("-------------------Chess Board-------------------");
        for(int i=0;i<board.length;i++)
        {for(int j=0;j<board[i].length;j++)
        System.out.print(board[i][j]+" ");
        System.out.println();
    }
    }
    public static void main(String args[])
    {
int n=4;
char board[][] = new char[n][n];
for(int i=0;i<n;i++)
{
    for(int j=0;j<n;j++)
    board[i][j]='X';

}
nQueens(board,0);
    }
    
}
