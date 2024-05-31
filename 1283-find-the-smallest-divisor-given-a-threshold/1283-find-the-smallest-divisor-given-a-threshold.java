class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt(); 
        while(low<=high){
            int mid=(high+low)/2;
            if(sum(nums,mid)<=threshold){
                high =mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return low;
    }
    public static int sum(int []nums,int div){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+= Math.ceil((double)(nums[i])/(double)(div));
        }
        return sum;
    }
}