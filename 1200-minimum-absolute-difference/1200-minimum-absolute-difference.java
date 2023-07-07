class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            int a2=arr[i]-arr[i-1];
            if(min>=a2){
                if(min>a2){
                ans.clear();
                min=a2;}
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;
    }
}