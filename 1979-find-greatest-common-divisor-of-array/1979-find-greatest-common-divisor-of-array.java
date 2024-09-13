class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        while(b>0){
            a=a%b;
            int temp=a;
            a=b;
            b=temp;
        }
        return a;
    }
}