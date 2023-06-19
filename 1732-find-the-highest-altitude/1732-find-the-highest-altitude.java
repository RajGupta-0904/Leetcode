class Solution {
    public int largestAltitude(int[] gain) {
       int total=0;
        int ans=0;
        for(int i=0;i<gain.length;i++){
            total+=gain[i];
            ans=Math.max(ans,total);
        }
        return ans;
    }
}