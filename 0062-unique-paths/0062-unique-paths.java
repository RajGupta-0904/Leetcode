class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int [m][n];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        return solve(m,n,dp);
    }
    static int solve(int m ,int n ,int dp[][]){
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                    continue;
                }
                int up=0;
                int down =0;
                if(i>0) up=dp[i-1][j];
                if(j>0) down =dp[i][j-1];
                dp[i][j]=up+down;
            }
        }
        return dp[m-1][n-1];
    }
}