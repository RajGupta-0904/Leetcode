class Solution {
    public int totalNQueens(int n) {
        boolean[][] board=new boolean[n][n];
        return countQueen(board,0,0);
    }
    public int countQueen(boolean[][] board,int cr,int queen_placed){
        if(queen_placed==board.length)
            return 1;
        if(cr>=board.length)
            return 0;
        int c=0;
        for(int i=0;i<board.length;i++){
            if(isitsafe(board,cr,i)){
                board[cr][i]=true;
                c+=countQueen(board,cr+1,queen_placed+1);
                board[cr][i]=false;
            }
        }
        return c;
    }
    public static boolean isitsafe(boolean[][] board, int row ,int col){
        int r=row;
        while(r>=0){
            if(board[r][col]==true)
                return false;
            r--;
        }
        r=row;
        int c=col;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        c=col;
        r=row;
        while(r>=0 && c<board.length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;

    }
}