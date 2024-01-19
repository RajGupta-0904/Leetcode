class Solution {
    public boolean canPartition(int[] nums) {
        int idx=nums.length;
        
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int [][]dp=new int [idx][sum/2+1];
        for(int []a:dp){
            Arrays.fill(a,-1);
        }
        if(sum%2==1){
            return false;
        }
        // int idx=nums.length;
        return ans(idx-1,sum/2,nums,dp);
    }
    public static boolean ans(int idx,int k,int []arr,int [][]dp){
        
       if(k==0){
           return true;
       } 
       if(idx==0){
           return (arr[0]==k);
       }
       if(dp[idx][k]!=-1){
           return dp[idx][k]==0?false:true;
       }
        boolean nottake=ans(idx-1,k,arr,dp);
        boolean take=false;
        if(arr[idx]<=k){
            take=ans(idx-1,k-arr[idx],arr,dp);
        }
        dp[idx][k]= take||nottake?1:0;
        return nottake||take;
        
    }
}