class Solution {
    public int minSteps(String s, String t) {
        int freq1[]=new int [26];
        int freq2[]=new int [26];
        for(char i:s.toCharArray()){
            freq1[i-'a']++;
        }
        for(char i:t.toCharArray()){
            freq2[i-'a']++;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            ans+=Math.abs(freq1[i]-freq2[i]);
        }
        ans=ans/2;
        return ans;
    }
}