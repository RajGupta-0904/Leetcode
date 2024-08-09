class Solution {
    public long subArrayRanges(int[] nums) {
        long smallest =sumSubarrayMins(nums);
        long largest =sumSubarrayMaxs(nums);
        return largest-smallest;
    }
    public long sumSubarrayMins(int[] arr) {
        int[] nse = NSE(arr);
        int[] pse = PSE(arr);
        long total = 0;
        long mod = 1_000_000_007;

        for (int i = 0; i < arr.length; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (total + (long) left * right * arr[i]);
        }

        return  total;
    }

    private int[] NSE(int[] nums) {
        int[] nse = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? nums.length : st.peek();
            st.push(i);
        }
        return nse;
    }

    private int[] PSE(int[] nums) {
        int[] pse = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }
    public long sumSubarrayMaxs(int[] arr) {
        int[] nge = NGE(arr);
        int[] pge = PGE(arr);
        long total = 0;
        long mod = 1_000_000_007;

        for (int i = 0; i < arr.length; i++) {
            int left = i - pge[i];
            int right = nge[i] - i;
            total = (total + (long) left * right * arr[i]);
        }

        return  total;
    }

    private int[] NGE(int[] nums) {
        int[] nge = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? nums.length : st.peek();
            st.push(i);
        }
        return nge;
    }

    private int[] PGE(int[] nums) {
        int[] pge = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < nums.length; i++) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }
            pge[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pge;
    }
}