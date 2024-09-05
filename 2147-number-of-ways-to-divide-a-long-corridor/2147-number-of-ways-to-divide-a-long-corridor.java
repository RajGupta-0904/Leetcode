class Solution {
    public int numberOfWays(String corridor) {
        int totalseat=0;
        int seat=0;
        long ans=1;
        int plant=0;
        int mod =1000_000_007;
        boolean iscorridor=false;
        for(int i=0;i<corridor.length();i++){
            if(corridor.charAt(i)=='S'){
                totalseat++;
                seat++;
            }
            else if(seat==0){
                plant++;
            }
            if(seat==2){
                if(iscorridor==false){
                    iscorridor =true;
                    
                }
                else{
                    ans=(ans*(plant+1))%mod;
                }
                seat=0;
                    plant=0;
            }
        }
        return totalseat % 2==1 || totalseat==0 ?0:(int)ans;
    }
}