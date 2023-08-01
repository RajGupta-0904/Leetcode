class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ll=new ArrayList<>();
        combination(n,k,ans,ll,1);
        return ans;
    }
    public static void combination(int n ,int k,List<List<Integer>>ans ,List<Integer> ll,int idx ){
        if(k==0){
            ans.add(new ArrayList(ll));
            return;
        }
        for(int i=idx;i<=n;i++){
            ll.add(i);
            combination(n,k-1,ans,ll,i+1);
            ll.remove(ll.size()-1);
        }
    }
}