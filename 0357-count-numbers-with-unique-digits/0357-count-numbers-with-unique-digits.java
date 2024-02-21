class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        return solve(n);
    }
    public static int solve(int n){
        if(n==0){
            return 1;
        }
        int c=9;
        for(int i=2;i<=n;i++){
            c=c*(11-i);
        }
        return c+solve(n-1);
    }
}