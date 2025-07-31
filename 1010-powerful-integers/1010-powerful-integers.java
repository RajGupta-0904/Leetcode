class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        List<Integer>ans=new ArrayList<>();
        int a=x==1 ?bound : (int)(Math.log(bound)/Math.log(x));
        int b=y==1 ?bound : (int)(Math.log(bound)/Math.log(y));
        HashSet<Integer>hs=new HashSet<>();
        for(int i =0;i<=a;i++){
            for(int j=0;j<=b;j++){
                int pi=(int)Math.pow(x,i)+(int)Math.pow(y,j);
                if(pi<=bound){
                    hs.add(pi);
                }
                if(y==1) break;
            }
        }
        for(int d:hs){
            ans.add(d);
        }
        return ans;
    }
}