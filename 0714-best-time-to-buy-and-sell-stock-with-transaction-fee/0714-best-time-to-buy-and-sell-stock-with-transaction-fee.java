class Solution {
    public int maxProfit(int[] raj, int fee) {
        int min=raj[0];
        int ans=0;
        for(int i:raj){
            min=Math.min(i,min);
            if(i-min-fee>0){
                ans+=i-min-fee;
                min=i-fee;
            }
        }
        return ans;
    }
}