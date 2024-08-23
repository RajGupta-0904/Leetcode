class Solution {
    public String fractionAddition(String expression) {
        String frac[]=expression.split("(?=[+-])");
        long num=0,den=1;
        for(String fr:frac){
            String []curr=fr.split("/");
            long a=Long.parseLong(curr[0]);
            long b=Long.parseLong(curr[1]);
            num=num*b + a*den;
            den=den*b;
            
        }
        if(num==0) return "0/1";
        long gcd=GCD(Math.abs(num),Math.abs(den));
        num/=gcd;
        den/=gcd;
        return num+"/"+den;
    }
    private long GCD(long a ,long b ){
        if(a==b)return a;
        if(a>b) return GCD(a-b,b);
        return GCD(a,b-a);
    }
}