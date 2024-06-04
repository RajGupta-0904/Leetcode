class Solution {
    public int minBitFlips(int start, int goal) {
        int ans=start^goal;
        return a(ans);
    }
    public int a(int n ){
        int c=0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
        return c;
    }
}