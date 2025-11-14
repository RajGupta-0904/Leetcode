class Solution {
    public String decodeString(String s) {
        Stack<Integer>numStack=new Stack<>();
        Stack<String> stringStack=new Stack<>();
        int k=0;

        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k=k*10+(ch-'0');
                continue;
            }
            if(ch=='['){
                numStack.push(k);
                k=0;
                stringStack.push(String.valueOf(ch));
                continue;
            }
            if(ch!=']'){
                stringStack.push(String.valueOf(ch));
                continue;
            }
            StringBuilder temp=new StringBuilder();
            while(!stringStack.peek().equals("[")){
                temp.insert(0,stringStack.pop());
            }
            stringStack.pop();
            StringBuilder replace=new StringBuilder();
            int count=numStack.pop();
            for(int i=0;i<count;i++){
                replace.append(temp);
            }
            stringStack.push(replace.toString());

        }
        StringBuilder ans=new StringBuilder();
        while(!stringStack.isEmpty()){
            ans.insert(0,stringStack.pop());
        }
        return  ans.toString();
        
    }
}