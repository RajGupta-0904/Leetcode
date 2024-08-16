class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int ans =Integer.MIN_VALUE;
        int prevMax=arrays.get(0).get(arrays.get(0).size()-1);
        int prevMin = arrays.get(0).get(0);
        for(int i=1;i<arrays.size();i++){
            // currentmin - prevmax
            ans=Math.max(ans,Math.abs(arrays.get(i).get(0)-prevMax));
            //currentmax - prevmin
            ans=Math.max(ans,Math.abs(arrays.get(i).get(arrays.get(i).size()-1)-prevMin));
            prevMax=Math.max(prevMax,arrays.get(i).get(arrays.get(i).size()-1));
             prevMin = Math.min(prevMin,arrays.get(i).get(0));
        }
        return ans;
    }
}