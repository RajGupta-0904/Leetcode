class Solution {
    public boolean isMatch(String s, String p) {
        int [][]dp=new int [s.length()][p.length()];
        return solve(s,p,0,0,dp);
    }
    static boolean solve(String s , String p,int i ,int j,int [][]dp){
        if(i==s.length()){
            for(int j2=j;j2<p.length();j2++){
                if(p.charAt(j2)!='*'){
                    return false;
                }
            }
            return true;
        }
        if(p.length()==j){
            return false;
        }
        if(dp[i][j]!=0){
            return dp[i][j]==1?true:false;
        }
        boolean ans ;
        if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='?'){
            ans=solve(s,p,i+1,j+1,dp);
        }
        else if(p.charAt(j)=='*'){
            boolean match =solve(s,p,i+1,j,dp);
            boolean dontmatch=solve(s,p,i,j+1,dp);
            ans=match||dontmatch;
        }
        else {
            ans=false;
        }
        if(ans){
            dp[i][j]=1;
        }else{
            dp[i][j]=2;
        }
        return ans;
    }
}