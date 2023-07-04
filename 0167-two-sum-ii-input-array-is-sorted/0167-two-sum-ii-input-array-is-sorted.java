class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] ans=new int [2];
        int low=0;
        int high=numbers.length-1;
        int t=0;
        while(low<high){
            t=numbers[low]+numbers[high];
            if(t==target){
                ans[0]=low+1;
                ans[1]=high+1;
                break;
            }
            else if(t>target){
                high--;
            }
            else{
                low++;
            }
        }
        return ans;
    }
}