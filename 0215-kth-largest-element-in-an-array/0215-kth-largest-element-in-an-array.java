class Solution {
    public int findKthLargest(int[] nums, int k) {
        return answer(nums,k);
    }
    public int answer(int []arr,int k){
        Arrays.sort(arr);
        int a=arr[arr.length-k];
        return a;
    }
}