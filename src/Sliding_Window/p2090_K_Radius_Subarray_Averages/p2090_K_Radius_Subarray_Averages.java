package Sliding_Window.p2090_K_Radius_Subarray_Averages;

import java.util.Arrays;

public class p2090_K_Radius_Subarray_Averages {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int[] avgs = new int[n];

        Arrays.fill(avgs, -1);

        if (k == 0)
            return nums;

        int right = k + k;
        if (right >= n)
            return avgs;

        long sum = 0;
        for (int i = 0; i <= right; i++) {
            sum += nums[i];
        }

        for (int i = k; i < n - k; i++) {
            avgs[i] = (int) (sum / (2 * k + 1));

            if (++right < n) {
                sum += nums[right] - nums[i - k];
            } else {
                return avgs;
            }
        }
        return avgs;
    }
}
