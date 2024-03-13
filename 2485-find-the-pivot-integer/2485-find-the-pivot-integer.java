class Solution {
    public int pivotInteger(int n) {
        for(int i=1;i<=n;i++){
            int ls=i*(i+1)/2;
            int rs=n*(n+1)/2-i*(i-1)/2;
            if(ls==rs){
                return i;
            }
        }
        return -1;
    }
}