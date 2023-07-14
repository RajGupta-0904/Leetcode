class Solution {
    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        min=(max-k)-(min+k);
        return min<0?0:min;
    }
}