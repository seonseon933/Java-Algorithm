package Prefix_Sum.p2090_K_Radius_Subarray_Averages;

public class p2090_K_Radius_Subarray_Averages {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];
        long[] prefix = new long[n];

        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            if (i - k < 0 || i + k >= n) {
                avgs[i] = -1;
            } else {
                long sum;
                if (i - k == 0) {
                    sum = prefix[i + k];
                } else {
                    sum = prefix[i + k] - prefix[i - k - 1];
                }
                avgs[i] = (int) (sum / (2 * k + 1));
            }
        }

        return avgs;
    }
}
