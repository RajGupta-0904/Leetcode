class Solution {
    public int beautifulSubsets(int[] nums, int k) {
        return solve(nums,k,0,new HashMap<>());
    }
    public int solve(int []arr,int k,int idx,HashMap<Integer,Integer> map){
        //base case 
        if(idx==arr.length){
            if(map.size()==0) return 0;
            return 1;
        }
        int pick =0;
        int ele1=arr[idx]+k;
        int ele2=arr[idx]-k;
        if(map.size()==0 || (!map.containsKey(ele1) && !map.containsKey(ele2))){
            //add elemt 
            map.put(arr[idx],map.getOrDefault(arr[idx],0)+1);
            //explore
            pick=solve(arr,k,idx+1,map);
            //backtrack
            map.put(arr[idx],map.get(arr[idx])-1);
            if(map.get(arr[idx])==0){
                map.remove(arr[idx]);
            }
        }
        int nopeak=solve(arr,k,idx+1,map);
        return pick+nopeak;
    }
}