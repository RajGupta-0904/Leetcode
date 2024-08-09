import java.util.Stack;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nse = NSE(arr);
        int[] pse = PSE(arr);
        long total = 0;
        long mod = 1_000_000_007;

        for (int i = 0; i < arr.length; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            total = (total + (long) left * right * arr[i]) % mod;
        }

        return (int) total;
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
}
