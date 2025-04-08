package Prefix_Sum.p724_Find_Pivot_Index;

public class p724_Find_Pivot_Index {
    public int pivotIndex(int[] nums) {
        int t = 0;
        for (int i : nums) {
            t += i;
        }
        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum = t - leftSum - nums[i];
            if (leftSum == rightSum)
                return i;
            leftSum += nums[i];
        }
        return -1;
    }
}
/*
 * [1,7,3,6,5,6] <- 28
 * i = 0 -> 0 vs 27
 * i = 1 -> 1 vs 20 (total - leftSum - pivot)
 * i = 2 -> 8 vs 17
 * i = 3 -> 11 vs 11
 */