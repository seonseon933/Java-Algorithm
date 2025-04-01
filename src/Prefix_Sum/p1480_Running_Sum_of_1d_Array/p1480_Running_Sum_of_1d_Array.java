package Prefix_Sum.p1480_Running_Sum_of_1d_Array;

public class p1480_Running_Sum_of_1d_Array {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];

        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = nums[i] + sum[i - 1];
        }
        return sum;
    }
}
