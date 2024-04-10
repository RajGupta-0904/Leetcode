class Solution {
    public int[] searchRange(int[] nums, int target) {
        int a=solve(nums,target);
        int b=solve1(nums,target);
        return new int []{a,b};
    }
    public static int solve(int [] nums,int k){
        int ans=-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int m=i+(j-i)/2;
            if(nums[m]==k){
                ans =m;
                j=m-1;
            }
            else if(nums[m]>k){
                // i=m+1;
                j=m-1;
            }
            else{
                // j=m-1;
                i=m+1;
            }
        }
        return ans;
    }
    public static int solve1(int [] nums,int k){
        int ans1=-1;
        int i=0;
        int j=nums.length-1;
        while(i<=j){
            int m=i+(j-i)/2;
            if(nums[m]==k){
                ans1=m;
                i=m+1;
            }
            else if(nums[m]>k){
                j=m-1;
            }
            else{
                i=m+1;;
            }
        }
        return ans1;
    }
}