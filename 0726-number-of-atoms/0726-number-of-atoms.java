class Solution {
    public String countOfAtoms(String formula) {
        Stack<HashMap<String,Integer>> st=new Stack<>();
        st.push(new HashMap<String,Integer>());
        int i=0;
        while(i<formula.length()){
            char ch =formula.charAt(i);
            if(ch=='('){
                st.push(new HashMap<String,Integer>());
                i++;
            }
            else if(ch==')'){
                HashMap<String,Integer> currMap=st.pop();
                i++;// move to the next character
                // for multipler
                StringBuilder sb =new StringBuilder();
                while(i<formula.length() && Character.isDigit(formula.charAt(i))){
                    sb.append(formula.charAt(i));
                    i++;
                }
                if(sb.length()>0){
                    int m=Integer.parseInt(sb.toString());
                    for(String atom:currMap.keySet()){
                        currMap.put(atom,currMap.get(atom)*m);
                    }
                }
                //insert pop stack into peak stack
                for(String atom :currMap.keySet()){
                    st.peek().put(atom,st.peek().getOrDefault(atom,0)+currMap.get(atom));
                }
            }
            else{//atom name and count
                StringBuilder atomName = new StringBuilder();
                atomName.append(formula.charAt(i));
                i++;
                while(i<formula.length() && Character.isLowerCase(formula.charAt(i)))   {
                    atomName.append(formula.charAt(i));
                    i++;
                }
                StringBuilder count =new StringBuilder();
                while(i<formula.length() && Character.isDigit(formula.charAt(i))){
                    count.append(formula.charAt(i));
                    i++;
                }
                int c=(count.length()>0)?Integer.parseInt(count.toString()):1;
                 st.peek().put(atomName.toString(),st.peek().getOrDefault(atomName.toString(),0)+c);
            }
        }
        TreeMap<String,Integer>mp=new TreeMap<>(st.peek());
        StringBuilder ans =new StringBuilder();{
            for(String a:mp.keySet()){
                ans.append(a);
                if(mp.get(a)>1){
                    ans.append(mp.get(a));
                }
            }
        }
        return ans.toString();
    }
}