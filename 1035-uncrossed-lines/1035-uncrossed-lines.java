class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        return solve(nums1,nums2);
    }
     public static int solve(int []s1,int [] s2){
       int dp[][]=new int [s1.length+1][s2.length+1];
    for(int i=1;i<dp.length;i++){
        for(int j=1;j<dp[0].length;j++){
             int ans=0;
        if(s1[i-1]==s2[j-1]){
            ans=1+dp[i-1][j-1];
        }else{
            int fs=dp[i-1][j];
            int sc=dp[i][j-1];
            ans=Math.max(fs,sc);
        }
         dp[i][j]=ans;
        }
    }
        return dp[dp.length-1][dp[0].length-1];
    }
}