class Solution {
    public long dividePlayers(int[] skills) {
        Arrays.sort(skills);
        int i=0;
        int j =skills.length-1;
        long ans=0;
        int b=skills[i]+skills[j];
        while(i<j){
            int a=skills[i]+skills[j];
            if(a!=b)return -1;
            ans+=(skills[i]*skills[j]);
            i++;
            j--;
        }
        return ans;
        
    }
}