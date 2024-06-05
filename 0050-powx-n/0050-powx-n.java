class Solution {
    public double myPow(double x, int n) {
        long m=n;
        // long n=m;
        double ans=1;
        if(m<0){
            m=m*-1;
            x=1/x;
            
        }
        while(m>0){
            if(m%2==1){
                ans=ans*x;
                m=m-1;
            }else{
                x=x*x;
                m=m/2;
            }
        }
        // if(m<0){
        //     ans=1/ans;
        // }
        return ans;
    }
}