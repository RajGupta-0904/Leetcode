class Solution {
    public int countDistinctIntegers(int[] nums) {
     int arr[]=new int [2*nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i];
            sum=0;
            int temp=nums[i];
            while(temp>0){
                sum=sum*10 + temp%10;
                temp/=10;
                
            }
            arr[nums.length+i]=sum;
        }
        Arrays.sort(arr);
        int c=1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                c++;
            }
        }
        return c;
    }
}