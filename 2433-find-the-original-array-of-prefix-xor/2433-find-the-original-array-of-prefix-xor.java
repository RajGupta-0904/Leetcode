class Solution {
    public int[] findArray(int[] pref) {
        int a=pref[0];
        for(int i=1;i<pref.length;i++){
            int temp=pref[i];
            pref[i]=a^pref[i];
            a=temp;
        }
        return pref;
    }
}