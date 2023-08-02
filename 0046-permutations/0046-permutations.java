class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> mans=new ArrayList<>();
        boolean[] f=new boolean[nums.length];
        sum(nums,mans,ans,f);
        return ans;
    }
    public static void sum(int[] nums,List<Integer> ans,List<List<Integer>> mn,boolean[] f){
        if(ans.size()==nums.length){
            List<Integer> c=new ArrayList<>(ans);
            mn.add(c);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(f[i]==false){
                ans.add(nums[i]);
                f[i]=true;
                sum(nums,ans,mn,f);
                ans.remove(Integer.valueOf(nums[i]));
                f[i]=false;
            }
        }        
    }
    
}