class Solution {
    public int minSwaps(String s) {
        int count=0;//no. of mismatched pair
        Stack<Character> st=new Stack<>();
        for(char a:s.toCharArray()){
            if(a=='['){
                st.push(a);
            }
            else{
                if(!st.isEmpty() && a==']'){
                    st.pop();
                }
                else{
                    count++;
                }
            }
        }
        return (count+1)/2;
    }
}