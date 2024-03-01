class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>>hs=new HashSet<>();//for storing unique ans 
        List<List<Integer>>ll=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                if((nums[i]+nums[j]+nums[k])==0){
                   hs.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if((nums[i]+nums[j]+nums[k])<0){
                    j++;
                }else{
                    k--;
                }
            }
        }
        // ll.addAll(hs);
        for(List<Integer> a:hs){
            ll.add(a);
        }
        return ll;
    }
}