class Solution {
    public int[] searchRange(int[] nums, int target) {
        int s=-1,e=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                s=i;
                break;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                e=i;
                break;
            }
        }
        int arr[]=new int[2];
        arr[0]=s;arr[1]=e;
        return arr;
        
    }
}