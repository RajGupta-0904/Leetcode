class Solution {
    public int minDistance(String word1, String word2) {
         int dp[][]=new int [word1.length()][word2.length()];
        for(int [] a:dp){
            Arrays.fill(a,-1);
        }
        return solve(word1,word2,0,0,dp);
    }
    public static int solve(String s1,String s2,int i,int j,int dp[][]){
        if(i==s1.length()){
            return s2.length()-j;
        }
        if(j==s2.length()){
            return s1.length()-i;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(s1.charAt(i)==s2.charAt(j)){
            ans=solve(s1,s2,i+1,j+1,dp);
        }
        else{
            int dl=solve(s1,s2,i+1,j,dp);
            int rp=solve(s1,s2,i+1,j+1,dp);
            int in=solve(s1,s2,i,j+1,dp);
            ans=Math.min(dl,Math.min(rp,in))+1;
        }
        return dp[i][j]=ans;
    }
}