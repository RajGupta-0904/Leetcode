class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashSet<Integer> ans =new HashSet<>();
        for(int n:nums){
            int i=2;
            while(n>1){
                if(n%i==0){
                    n=n/i;
                    ans.add(i);
                }else{
                    i++;
                }
            }
        }
        return ans.size();
    }
}