class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq[]=new int [26];
        for(int i=0;i<chars.length();i++){
            freq[chars.charAt(i)-'a']++;
        }
        int ans=0;
        for(String s:words){
            if(solve(s,freq)){
                ans+=s.length();
            }
        }
        return ans;
    }
    public static boolean solve(String s,int []freq){
        int newfreq[] = new int [26];
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'a';
            newfreq[x]++;
            if(newfreq[x]>freq[x]){
                return false;
            }
        }
        return true;
    }
}