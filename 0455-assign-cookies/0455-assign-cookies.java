class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int n=s.length;
        if(n==0){
            return 0;
        }
        int ans=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int sind=n-1;
        int gid=g.length-1;
        while(sind>=0 && gid>=0){
            if(s[sind]>=g[gid]){
                ans++;
                sind--;
                gid--;
            }else{
                gid--;
            }
        }
        return ans;
    }
}