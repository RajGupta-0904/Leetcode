class Solution {
    public String longestPrefix(String s) {
        int n=solve(s);
        return s.substring(0,n);
    }
    public static int solve(String s){
        int dp[]=new int [s.length()];
        int len=0;
        for(int i=1;i<dp.length;){
            if(s.charAt(i)==s.charAt(len)){
                len++;
                dp[i]=len;
                i++;
            }else{
                if(len>0){
                    len=dp[len-1];
                }else{
                    i++;
                }
                
            }
        }
        return dp[s.length()-1];
    }
}