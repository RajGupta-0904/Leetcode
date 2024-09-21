class Solution {
    public void setZeroes(int[][] arr) {
        int n =arr.length;
        int m =arr[0].length;
        boolean row=false;
        boolean col=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                    if(i==0) row=true;
                    if(j==0) col=true;
                }
            }
        }
        
        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][0]==0||arr[0][j]==0){
                    arr[i][j]=0;
                }
            }
         }
        if(row){
            for(int i=0;i<m;i++){
                arr[0][i]=0;
            }
        }
         if(col){
            for(int i=0;i<n;i++){
                arr[i][0]=0;
            }
        }
        // return arr;
    }
}