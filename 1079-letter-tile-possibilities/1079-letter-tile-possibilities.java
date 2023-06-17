class Solution {
    public int numTilePossibilities(String str) {
        
        int ans=solve(str,"");
        return ans;
    }
    
    public static int solve(String ques, String ans){
        int count=0;
        for(int i=0;i<ques.length();i++){
            char ch=ques.charAt(i);
            boolean f=false;
            for(int j=i+1;j<ques.length();j++){
                if(ques.charAt(j)==ch){
                    f=true;
                    break;
                }
            }
            if(f==false){
                String s1=ques.substring(0,i);
                String s2=ques.substring(i+1);
                count+=solve(s1+s2,ans+ch)+1;
            }
        }
        // System.out.print(ans+" ");
        return count;
    }
}