class Solution {
    public int minimizeXor(int a, int b) {
        int c=count(b);
        int x=0;
        for(int i=31;i>=0&c>0;i--){
            if((a&(1<<i))!=0){
                x+=1<<i;
                c--;
            }
        }
        for(int i=0;i<=31&c>0;i++){
            if((a&(1<<i))==0){
                x+=1<<i;
                c--;
            }
        }
        return x;
        
    }
    public static int count(int n){
        int c=0;
        while(n>0){
            n=n&(n-1);
            c++;
        }
        return c;
    }
}