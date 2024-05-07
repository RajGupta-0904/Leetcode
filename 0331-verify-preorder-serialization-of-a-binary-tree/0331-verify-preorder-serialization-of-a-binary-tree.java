class Solution {
    public boolean isValidSerialization(String preorder) {
        if(preorder == null){
            return false;
        }
        Stack<String>st=new Stack<>();
        String []s=preorder.split(",");
        for(int i=0;i<s.length;i++){
            String curr=s[i];
            while(curr.equals("#")  &&  !st.isEmpty() &&  st.peek().equals(curr)){
                st.pop();
                if(st.isEmpty()){
                    return false;
                }
                st.pop();
            }
            st.push(curr);
        }
        return st.size()==1 && st.peek().equals("#");
    }
}