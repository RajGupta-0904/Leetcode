class Solution {
    public String removeKdigits(String num, int k) {
        // if(num.length()==k)
        //     return "0";
        Stack<Character> st=new Stack<>();
        // st.push(num.charAt(0));
        for(int i=0;i<num.length();i++){
            while(k!=0 && !st.isEmpty() && st.peek()-'0'>num.charAt(i)-'0'){
                st.pop();
                k--;
            }
            st.push(num.charAt(i));
        }
        // System.out.println(k);
        // return "123";
        while(k>0){
            st.pop();
            k--;
        }
        String ans="";
        for(char c:st){
            if(ans.length()==0 && c-'0'==0){
                continue;
            }
            ans+=c;
        }
        if(ans.length()==0)
            return "0";
        return ans;
    }
}