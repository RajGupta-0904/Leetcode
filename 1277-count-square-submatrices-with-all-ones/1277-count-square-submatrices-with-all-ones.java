class Solution {
    public int countSquares(int[][] matrix) {
     int r=matrix.length;
     int c=matrix[0].length;
        int dp[][]=new int [r+1][c+1];
        int ans=0;
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(matrix[i-1][j-1]!=0){
                dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i][j-1]))+1;
                ans+=dp[i][j];
            }
        }
        }
        return ans;
    }
}