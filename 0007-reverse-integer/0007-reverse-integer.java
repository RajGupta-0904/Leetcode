class Solution {
    public int reverse(int x) {
        int sum=0;
        int r;
        int a=Integer.MAX_VALUE;
         int b=Integer.MIN_VALUE;
        
        while(x!=0){
            if(sum>a/10||sum<b/10)
                return 0;
            r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        return sum;
        
    }
}