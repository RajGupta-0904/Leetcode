class Solution {
    public String reverseWords(String s) {
        String [] raj=s.split(" ");
        String ans="";
        for(int i=0;i<raj.length;i++){
            ans=ans+ answer(raj[i],"")+" ";
        }
        ans=ans.trim();
        return ans;
    }
    public static String answer(String ques,String ans){
        for(int i=ques.length()-1;i>=0;i--){
            ans=ans+ques.charAt(i);
        }
        return ans;
    }
}