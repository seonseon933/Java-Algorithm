package Sliding_Window.p643_Maximum_Average_Subarray_I;

public class p643_Maximum_Average_Subarray_I {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double avg = sum / (double) k;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            avg = Math.max(avg, sum / (double) k);
        }
        return avg;
    }
}