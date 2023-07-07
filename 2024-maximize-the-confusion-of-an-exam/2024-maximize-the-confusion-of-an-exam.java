class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int a=answer(answerKey,k,'T');
        int b=answer(answerKey,k,'F');
        return Math.max(a,b);
        
    }
    public static int answer(String ques, int k,char ch){
        int si=0;
        int ei=0;
        int flag=0;
        int ans=Integer.MIN_VALUE;
        while(ei<ques.length()){
            if(ques.charAt(ei)==ch){
                flag++;
            }
            while(flag>k){
                if(ques.charAt(si)==ch){
                    flag--;
                //  si++;
                }
                si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;

        }
        return ans;
    }
}