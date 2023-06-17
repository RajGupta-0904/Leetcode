class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     
        List<Integer> ll=new ArrayList<>();
         int arr[]=new int [100001];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            if(arr[nums[i]]==2){
                ll.add(nums[i]);
            }
        }
        return ll;
    }
}