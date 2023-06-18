class Solution {
    public List<Integer> getRow(int r) {
       List<Integer> ll =new ArrayList<>();
        for(int i=0;i<=r;i++){
            int n=1;
            for(int j=0;j<=i;j++){
                if(i==r){
                    ll.add(n);
                }
                n=(int)(((i-j)*(long)(n))/(j+1));
            }
        }
        return ll;
    }
}