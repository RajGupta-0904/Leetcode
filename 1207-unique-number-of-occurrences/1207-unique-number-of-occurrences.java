class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer>hs=new HashSet<>();
        for(int i:map.keySet()){
            if(!hs.contains(map.get(i))){
                hs.add(map.get(i));
            }else{
                return false;
            }
        }
        return true;
    }
}