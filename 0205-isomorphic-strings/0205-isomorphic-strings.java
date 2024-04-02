class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] str = s.toCharArray(), ttr = t.toCharArray();
        int[] mapS = new int[200], mapT = new int[200];    
        
        for(int i = 0; i < str.length; i++){
            //check if both these chars are not mapped to any other position
            if(mapS[str[i]] != mapT[ttr[i]])
                return false;
            //Map them with same position
            mapS[str[i]] = i+1;
            mapT[ttr[i]] = i+1;
        }   
        return true;
    }
}