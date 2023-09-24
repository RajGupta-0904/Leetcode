// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         for(int i:nums){
//             map.put(i, map.getOrDefault(i, 0)+1);
//         }

//         int[] ans = new int[k];

//         PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>(){
//             public int compare(Integer a, Integer b){
//                 return map.get(b)-map.get(a);
//             }
//         });

//         for(int i:map.keySet()){
//             queue.add(i);
//         }
//         for(int i=0; i<k; i++){
//             ans[i]=queue.poll();
//         }
//         return ans;
//     }
// }

// HASHMAP AND ArrayList


class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i:nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        int[] ans = new int[k];

        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                return map.get(b)-map.get(a);
            }
        });
    
        for(int i=0; i<k; i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}