class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }
        int ans=0;
        for(int key:mp.keySet()){
            int t = mp.get(key);
            if (t == 1)
                return -1;
            ans += t / 3;
            if (t % 3 != 0) 
                ans++;
        }
        return ans;
    }
}
