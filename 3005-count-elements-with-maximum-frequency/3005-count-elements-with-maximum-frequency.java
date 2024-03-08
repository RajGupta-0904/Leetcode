class Solution {
    public int maxFrequencyElements(int[] a) {
         int n = a.length;
        int maxi = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
            maxi = Math.max(maxi, map.get(a[i]));
        }

        int cnt = 0;
        for (int i : map.keySet()) {
            if (map.get(i) == maxi) {
                cnt += maxi;
            }
        }

        return cnt;
    }
}