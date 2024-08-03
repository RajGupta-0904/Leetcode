class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n =target.length;
            int  m =arr.length;
        if(n!=m) return false;
        int freq[]=new int[1001];
        for(int i=0;i<n;i++){
            freq[target[i]]++;
            freq[arr[i]]--;
        }
        for(int a:freq){
            if(a!=0){
                return false;
            }
        }
        return true;
    }
}