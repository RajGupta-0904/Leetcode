class Solution {
    public int[] nextGreaterElements(int[] nums2) {
         int nge[]=new int [nums2.length];
        Stack<Integer>st=new Stack<>();
        for(int i=2*nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i%nums2.length]){
                st.pop();
            }
            if(i<nums2.length)
            nge[i]=st.isEmpty()?-1:st.peek();
            st.push(nums2[i%nums2.length]);
        }
        return nge;
    }
}