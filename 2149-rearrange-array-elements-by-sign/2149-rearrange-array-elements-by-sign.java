class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []ans=new int [nums.length];
        int last=nums.length-1;
        int p=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                ans[p]=nums[i];
                p++;
            }
            else{
                ans[last]=nums[i];
                last--;
            }
        }
     last=nums.length-1;
        p=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=ans[last];
                last--;
            }else{
                nums[i]=ans[p];
                p++;
            }
        }    
        return nums;
    }
}