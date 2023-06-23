class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l=0;
        int h=letters.length-1;
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(letters[m]-target>0){
                h=m-1;
                ans=m;
            }
            else{
                l=m+1;
            }
        }
        return letters[ans];
    }
}