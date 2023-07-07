class Solution {
    public int longestOnes(int[] nums, int k) {
        int a=answer(nums,k,0);
        return a;
    }
    public static int answer(int raj[],int k, int ch){
        int si=0;
        int ei=0;
        int ans=-1;
        int flag=0;
        while(ei<raj.length){
            if(raj[ei]==ch){
                flag++;
            }
            while(flag>k){
                if(raj[si]==ch){
                    flag--;
                    
                }
                 si++;
            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}