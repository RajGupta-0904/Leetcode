class Solution {
    public int[] dailyTemperatures(int[] arr) {
        int ans []=new int [arr.length];
        Stack<Integer>st=new Stack<>();
        for(int i =0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                int idx=st.pop();
                ans[idx]=i-idx;
            }
            st.push(i);
        }
        return ans;
        
    }
}