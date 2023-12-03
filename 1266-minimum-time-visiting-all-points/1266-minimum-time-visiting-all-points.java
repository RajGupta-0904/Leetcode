class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int ans=0;
        for(int i=1;i<points.length;i++){
            ans+=solve(points[i-1],points[i]);
        }
        return ans;
    }
    public int solve(int []si,int []ei){
        int x=Math.abs(si[0]-ei[0]);
        int y=Math.abs(si[1]-ei[1]);
        return Math.max(x,y);
    }
}