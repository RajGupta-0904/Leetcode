class Solution {
    public int[][] construct2DArray(int[] arr, int m, int n) {
        if(m*n != arr.length) return new int[][]{};
        int ans[][]=new int [m][n];
        int a=0;
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j]=arr[a];
                a++;
            }
        }
        return ans;
    }
}