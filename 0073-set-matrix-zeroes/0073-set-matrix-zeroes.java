class Solution {
    public void setZeroes(int[][] a) {
         boolean r=false;
        boolean c=false;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                    if(i==0) r=true;
                    if(j==0) c=true;
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }
         for(int i=1;i<a.length;i++){
            for(int j=1;j<a[0].length;j++){
                if(a[i][0]==0||a[0][j]==0){
                    a[i][j]=0;
                }
            }
         }
        if(r==true){
            for(int i=0;i<a[0].length;i++){
                a[0][i]=0;
            }
        }
        if(c==true){
            for(int i=0;i<a.length;i++){
                a[i][0]=0;
            }
        }
        
    }
}