class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<2){
            return nums.length;
        }
        Arrays.sort(nums);
        int max=Integer.MIN_VALUE;
        int c=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                c++;
            }
           else if(nums[i]!=nums[i-1]){
                c=1;
            }
            if(c>max){
                max=c;
            }
        }
        return max==Integer.MIN_VALUE?1:max;
    }
}