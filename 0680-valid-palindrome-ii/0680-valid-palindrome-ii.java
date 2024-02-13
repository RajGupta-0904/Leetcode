class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(solve(s,i+1,j)){
                    return true;
                }
                if(solve(s,i,j-1)){
                    return true;
                }
                
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
    public static boolean solve(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}