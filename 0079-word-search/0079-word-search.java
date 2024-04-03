class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    boolean ans=ws(board,word,i,j,0);
                    if(ans)
                        return ans;
                }
            }
        }
        return false;
    }
    public static boolean ws(char[][] board,String word,int cr,int cc,int idx){
        if(idx==word.length())
            return true;
        if(cr<0 || cc<0 || cr>=board.length || cc>=board[0].length || board[cr][cc]!=word.charAt(idx))
            return false;
        int[] r={-1,1,0,0};
        int[] c={0,0,-1,1};
        board[cr][cc]='*';
        boolean ans=false;
        for(int i=0;i<c.length;i++){
            ans=ws(board,word,cr+r[i],cc+c[i],idx+1);
            if(ans)
                return ans;
        }
        board[cr][cc]=word.charAt(idx);
        return false;

    }
}