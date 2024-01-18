class Solution {
    public int minCut(String s) {
        int dp[]=new int [s.length()];
        int sol=solve(s,0,dp);
        return sol-1;
    }
    public static boolean ispalindrome(int i,int j,String part){
        // int i=0,j=part.length()-1;
        while(i<j){
            if(part.charAt(i)!=part.charAt(j))
                return false;
            i++;
            j--;
        }
    return true;
    }
    public static int solve(String ques,int idx,int []dp){
        if(idx==ques.length()){
            return 0;
        }
        if(dp[idx]!=0){
            return dp[idx];
        }
        int ans=Integer.MAX_VALUE;
        // String part="";
        for(int i=idx;i<ques.length();i++){
            // part=ques.substring(idx);
            if(ispalindrome(idx,i,ques)){
                int cut=1+solve(ques,i+1,dp);
                ans=Math.min(ans,cut);
            }
        }
        return dp[idx]=ans;
    }
}