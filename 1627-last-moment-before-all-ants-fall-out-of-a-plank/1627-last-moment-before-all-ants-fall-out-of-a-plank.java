class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int ans=0;
        for(int a:left){
            ans=Math.max(ans,a);
        }
        for(int b:right){
            ans=Math.max(ans,n-b);
        }
        return ans;
    }
}