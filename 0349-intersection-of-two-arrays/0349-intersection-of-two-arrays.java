class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     
        HashSet<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums1) {
            frequencyMap.put(num, 1);
        }

        for (int num : nums2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                set.add(num);
                frequencyMap.put(num,0);
            }
        }

        int[] arr = new int[set.size()];
        int i = -1;
        for(int val : set)  arr[++i]=val;

        return arr;

    }
}