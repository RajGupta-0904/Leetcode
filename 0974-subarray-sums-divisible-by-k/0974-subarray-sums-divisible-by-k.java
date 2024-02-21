class Solution {
    public int subarraysDivByK(int[] nums, int k) {
       return GoodSubArray(nums,k);
    }
    public static int GoodSubArray(int[] arr,int k) {
		int n = arr.length;
		long[] frq = new long[k];
		long sum = 0;
		frq[0] = 1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];// sum = sum+arr[i]
			int idx = (int)(sum % k);
			if (idx < 0) {
				idx += k;
			}
			frq[idx]++;

		}
		long ans = 0;
		for (int i = 0; i < frq.length; i++) {
			if (frq[i] >= 2) {
				ans = ans + (frq[i] * (frq[i] - 1)) / 2;
			}
		}
		return (int)ans;

	}
}