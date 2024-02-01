class Solution {
    public boolean isAnagram(String s, String t) {
     String s1=Key(s);
        String t1=Key(t);
        return s1.equals(t1);
    }
    public static String Key(String str) {
		int frq[] = new int[26];
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			frq[ch - 'a']++;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < frq.length; i++) {
			sb.append(frq[i] + " ");
		}
		return sb.toString();

	}
}