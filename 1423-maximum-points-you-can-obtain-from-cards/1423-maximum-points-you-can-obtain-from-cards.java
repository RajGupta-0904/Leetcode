class Solution {
    public int maxScore(int[] arr, int k) {
        int leftsum=0,rightsum=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            leftsum+=arr[i];
        }
        ans=leftsum;
        int idx=arr.length-1;
        for(int i=k-1;i>=0;i--){
            leftsum-=arr[i];
            rightsum+=arr[idx];
            idx=idx-1;
            ans=Math.max(leftsum+rightsum,ans);
        }
        return ans;
    }
}