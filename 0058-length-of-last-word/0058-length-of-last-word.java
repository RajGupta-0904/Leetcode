class Solution {
    public int lengthOfLastWord(String s) {
        String arr[]= s.split(" ");
        int a=arr[arr.length-1].length();
        return a;
    }
}