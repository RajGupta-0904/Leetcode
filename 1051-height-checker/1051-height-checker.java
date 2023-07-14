class Solution {
    public int heightChecker(int[] heights) {
        int ans=0;
        int []arr=new int [heights.length];
        for(int ele:heights){
            arr[ans]=ele;
            ans++;
        }
        ans=0;
        Arrays.sort(arr);
        
        for(int i=0;i<heights.length;i++){
            if(heights[i]!=arr[i]){
                ans++;
            }
        }
        return ans;
    }
}