class Solution {
    static int mod=1000_000_007;
    public int knightDialer(int n) {
        int dp[][][]=new int [n+1][4][3];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                for(int k=0;k<dp[0][0].length;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        int ans=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                ans=(ans+solve(n-1,i,j,dp))%mod;
            }
        }
        return ans;
    }
    public static int solve(int n,int cr,int cc,int [][][]dp){
        if (cc < 0 || cr < 0 || cc >= 3 || cr >= 4 || (cr == 3 && cc == 0) || (cr == 3 && cc == 2)) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		if(dp[n][cr][cc]!=-1)
		{
			return dp[n][cr][cc];
		}
		int[] r = { -2, -2, -1, 1, -1, 1, 2, 2 };
		int[] c = { 1, -1, -2, -2, 2, 2, -1, 1 };

		int count = 0;
		for (int i = 0; i < c.length; i++) {
			count = (count+solve(n - 1, cr + r[i], cc + c[i], dp)%mod)%mod;
		}
		return dp[n][cr][cc] = count;
        
    }
}