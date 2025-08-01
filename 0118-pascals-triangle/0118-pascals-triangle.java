class Solution {
    public List<List<Integer>> generate(int r) {
          List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<r;i++){
            int n=1;
             List<Integer> ll =new ArrayList<>();
            for(int j=0;j<=i;j++){
                 ll.add(n);
                n=(int)(((i-j)*(long)(n))/(j+1));
            }
            ans.add(new ArrayList(ll));
            ll.clear();
        }
        return ans;
    }
}