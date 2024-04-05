class Solution {
    public String makeGood(String s) {
        Stack<Character>st=new Stack<>();
        for(char a:s.toCharArray()){
            if(!st.isEmpty() && Math.abs(a-st.peek())==32){
                st.pop();

            }
            else{
                st.push(a);
            }
        }
          StringBuilder result = new StringBuilder();
        while (!st.isEmpty()) {
            result.insert(0, st.pop());
        }
        
        return result.toString();
    }
}