class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
     Arrays.sort(happiness);
        int j=0;
        long ans=0;
        for(int i=happiness.length-1;i>=happiness.length-k;--i){
            happiness[i]=Math.max(happiness[i]-j++,0);
                ans+=happiness[i];
        }
        return ans;
    }
}