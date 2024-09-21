class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
        String a=strs[0];
        String b=strs[strs.length-1];
        for(int i =0;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)!=b.charAt(i)){
                return sb.toString();
            }
            sb.append(a.charAt(i));
        }
        return sb.toString();
    }
}