class Solution {
    public int countGoodNumbers(long n) {
       long odd=n/2;
        long even =n/2+n%2;
        return (int)((solve(5,even)*solve(4,odd))%1000000007);
    }
    static long solve(long a,long b ){
	   // if(b==0) return 1;
	    long ans=1;
	    while(b>0){
	        if((b&1)==1){
	            ans=(ans*a)%1000000007;
	        }
	        a=(a*a)%1000000007;
	        b=b>>1;
	    }
	    return ans;
	}
}