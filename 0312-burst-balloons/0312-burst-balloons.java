class Solution {
    public int maxCoins(int[] nums) {
        int arr[]=new int [nums.length+2];
        for(int i=1;i<arr.length-1;i++){
            arr[i]=nums[i-1];
        }
        arr[0]=arr[arr.length-1]=1;
        int N=arr.length;
         int dp[][]=new int [N][N];
        for(int []a:dp)
        Arrays.fill(a,-1);
        return solve(arr,0,N-1,dp);
    }
    static int solve(int arr[],int i,int j ,int [][]dp){
        if(i+1==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans=Integer.MIN_VALUE;
        for(int k=i+1;k<j;k++){
            int f1=solve(arr,i,k,dp);
            int f2=solve(arr,k,j,dp);
            int f3=arr[i]*arr[j]*arr[k];
            ans=Math.max(ans,f1+f2+f3);
        }
        return dp[i][j]=ans;
    }
}