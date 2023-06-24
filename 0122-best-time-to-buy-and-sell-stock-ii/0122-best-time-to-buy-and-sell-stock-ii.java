class Solution {
    public int maxProfit(int[] raj) {
        int profit=0;
        for(int i=1;i<raj.length;i++){
            if(raj[i-1]<raj[i]){
                profit+=raj[i]-raj[i-1];
            }
        }
        return profit;
    }
}