class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        Arrays.sort(candidates);
        combination(candidates,target,ans,ll,0);
        return ans;
    }
    public static void combination(int []arr ,int target,List<List<Integer>>ans ,List<Integer> ll,int idx ){
        if(target==0){
            ans.add(new ArrayList(ll));
            return;
        }
        if(target<0)return;
        for(int i=idx;i<arr.length;i++){
            if(i==idx || arr[i]!=arr[i-1]){
            if(arr[i]<=target){
                ll.add(arr[i]);
                combination(arr,target-arr[i],ans,ll,i+1);
                ll.remove(ll.size()-1);
            }
            }
        }
    }
}