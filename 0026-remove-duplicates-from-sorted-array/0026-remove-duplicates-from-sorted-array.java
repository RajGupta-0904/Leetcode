class Solution {
    public int removeDuplicates(int[] nums) {
                 int n = nums.length;
        int[] arr = new int[n];
       arr[0]=nums[0];
       int count=1;
       for(int i=1;i<n;i++){
           if(arr[count-1]!=nums[i]){
               arr[count]=nums[i];
               count++;
           }
       }
       for(int i=0;i<n;i++){
           nums[i]=arr[i];
       }
       return count;

    }
}