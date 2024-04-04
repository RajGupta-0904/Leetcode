class Solution {
    public int maxDepth(String s) {
        Stack<Character> st=new Stack<>();
        int depth=0;
        int ans=0;
        for(char a:s.toCharArray()){
            if(a=='('){
                st.push(a);
                depth++;
                ans=Math.max(ans,depth);
            }
            else{
                if(a==')'){
                    depth--;
                    st.pop();
                }
            }
        }
        return ans;
    }
}