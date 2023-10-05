class Solution {
    public int change(int amount, int[] coins) {
        int [][]dp=new int [amount+1][coins.length];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return solve(coins,amount,0,dp);
    }
    // isme two call lgegi inclusion and exclusion ..inclusion ka call tbhi jayega jb ammount ki value current coin se jyda hogi .
    // ye inclusion exclusion Dp h 
    //Dp ka dimension amount+1 hoga and coin k length bhi hoga mtlb 2D DP bnega
    
    // ye top down dp h 
    public static int solve(int [] coin ,int amount,int i,int [][]dp){
        if(amount==0){
            return 1;
        }
        if(i==coin.length){
            return 0;
        }
        if(dp[amount][i]!=-1){
            return dp[amount][i];
        }
        int inc=0,exc=0;
        if(amount>=coin[i]){
            inc=solve(coin,amount-coin[i],i,dp);
        }
        exc=solve(coin,amount,i+1,dp);
        return dp[amount][i]=inc+exc;
        
    }
}