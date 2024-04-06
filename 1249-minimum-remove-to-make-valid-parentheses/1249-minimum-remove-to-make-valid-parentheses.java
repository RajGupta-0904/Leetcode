class Solution {
    public String minRemoveToMakeValid(String s) {
        char arr[]=s.toCharArray();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else if(s.charAt(i)==')'){
                if(st.size()==0){
                    arr[i]='*';
                }
                else{
                    st.pop();
                }
            }
        }
        while(!st.isEmpty()){
            arr[st.pop()]='*';
        }
        StringBuilder sb=new StringBuilder();
        for(char a:arr){
            if(a!='*'){
                sb.append(a);
            }
        }
        return sb.toString();
    }
}