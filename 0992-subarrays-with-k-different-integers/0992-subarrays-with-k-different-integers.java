class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums,k)-solve(nums,k-1);
    }
    public static int solve(int []arr,int k){
        int si=0,ei=0,ans=0,c=0;
        int []freq=new int [arr.length+1];
        while(ei<arr.length){
            if(freq[arr[ei]]==0){
                c++;
            }
            freq[arr[ei]]++;
            while(si<=ei && c>k){
                freq[arr[si]]--;
                if(freq[arr[si++]]==0){
                    c--;
                }
            }
            ans+=ei-si+1;
            ei++;
        }
        return ans;
    }
}