package Sliding_Window.p209_Minimum_Size_Subarray_Sum;

public class p209_Minimum_Size_Subarray_Sum {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int res = Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }
        if (res == Integer.MAX_VALUE)
            return 0;
        else
            return res;
    }
}