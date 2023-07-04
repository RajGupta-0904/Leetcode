class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int []r=new int [m];
        int []c=new int [n];
        for(int a[]:indices){
            r[a[0]]++;
            c[a[1]]++;
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if((r[i]+c[j])%2==1)
                    ans++;
            }
        }
        return ans;
    }
}