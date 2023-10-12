class Solution {
    public int minFallingPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
		for (int[] a : dp) {
			Arrays.fill(a, 100000);
		}
        int ans = Integer.MAX_VALUE;
		for (int i = 0; i < grid[0].length; i++) {
			ans = Math.min(ans, solve(grid, 0, i, dp));

		}
        return ans;
    }
    public static int solve(int [][]grid,int cr,int cc,int dp[][]){
        if(cr>=grid.length || cc<0 ||cc>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(cr==grid.length-1){
            return grid[cr][cc];
        }
        if(dp[cr][cc]!=100000){
            return dp[cr][cc];
        }
        int left=solve(grid,cr+1,cc-1,dp);
        int down=solve(grid,cr+1,cc,dp);
        int right=solve(grid,cr+1,cc+1,dp);
        return dp[cr][cc]= Math.min(left,Math.min(right,down))+grid[cr][cc];
    }
}