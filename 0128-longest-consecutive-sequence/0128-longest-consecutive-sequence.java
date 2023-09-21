class Solution {
    public int longestConsecutive(int[] nums) {
//         log(n) solution
        // if(nums.length<2){
        //     return nums.length;
        // }
        // Arrays.sort(nums);
        // int max=Integer.MIN_VALUE;
        // int c=1;
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]==nums[i-1]+1){
        //         c++;
        //     }
        //    else if(nums[i]!=nums[i-1]){
        //         c=1;
        //     }
        //     if(c>max){
        //         max=c;
        //     }
        // }
        // return max==Integer.MIN_VALUE?1:max;
        return solve(nums);
    }
    public static int solve(int []arr){
        HashMap<Integer,Boolean> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]-1)){
                map.put(arr[i],false);
            }
            else{
                map.put(arr[i],true);           
            }
            if(map.containsKey(arr[i]+1)){
                map.put(arr[i]+1,false);
            }
        }
        int ans=0;
        for(int key : map.keySet()){
            if(map.get(key)){
                int count=0;
                    while(map.containsKey(key)){
                        count++;
                        key++;
                    }
                ans=Math.max(ans,count);
            }
            
            
        }
        return ans;
    }
}