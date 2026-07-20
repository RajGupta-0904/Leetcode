class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       int m =grid.length;
       int n =grid[0].length;
       k=k%(n*m);
       List<List<Integer>> ans =new ArrayList<>();
       for(int i=0;i<m;i++){
        List<Integer> ll=new ArrayList<>();
        for(int j=0;j<n;j++){
            ll.add(0);
        }
        ans.add(ll);
       }
       for(int i =0;i<m;i++){
        for(int j =0;j<n;j++){
            int oidx=i*n+j;
            int nidx=(oidx+k)%(n*m);
            int nr=nidx/n;
            int nc=nidx%n;
            ans.get(nr).set(nc,grid[i][j]);
        }
       }
       return ans;
    }
}