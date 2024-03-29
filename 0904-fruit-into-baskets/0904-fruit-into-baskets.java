class Solution {
    public int totalFruit(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int si=0,ei=0,ans=Integer.MIN_VALUE,size=0;
        while(ei<arr.length){
            if(!map.containsKey(arr[ei])){
                size++;
                map.put(arr[ei],1);
                while(size>2){
                    int occ=map.get(arr[si]);
                    if(occ==1){
                        map.remove(arr[si]);
                        size--;
                    }
                    else{
                        map.put(arr[si],occ-1);
                    }
                    si++;
                }
            }
            else{
                map.put(arr[ei],map.getOrDefault(arr[ei],0)+1);

            }
            ans=Math.max(ans,ei-si+1);
            ei++;
        }
        return ans;
    }
}