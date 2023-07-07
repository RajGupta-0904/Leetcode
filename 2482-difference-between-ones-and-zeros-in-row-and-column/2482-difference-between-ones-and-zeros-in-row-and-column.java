class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][]diff= new int [n][m];
        int or[]=new int [n];
        int oc[]=new int[m];
        int zr[]=new int [n];
        int zc[]=new int [m];
        int ones=0;
        int zeros=0;
        for(int i=0;i<n;i++){
            ones=0;
            zeros=0;
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    zeros++;
                }else{
                    ones++;
                }
            }
            or[i]=ones;
            zr[i]=zeros;
        }
        for(int i=0;i<m;i++){
            ones=0;
            zeros=0;
            for(int j=0;j<n;j++){
                if(grid[j][i]==0){
                    zeros++;
                }else{
                    ones++;
                }
            }
            oc[i]=ones;
            zc[i]=zeros;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                diff[i][j]=or[i]+oc[j]-zr[i]-zc[j];
            }
        }
        return diff;
    }
}