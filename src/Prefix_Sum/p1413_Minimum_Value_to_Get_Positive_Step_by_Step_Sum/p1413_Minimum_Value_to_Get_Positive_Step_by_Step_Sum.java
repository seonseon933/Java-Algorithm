package Prefix_Sum.p1413_Minimum_Value_to_Get_Positive_Step_by_Step_Sum;

public class p1413_Minimum_Value_to_Get_Positive_Step_by_Step_Sum {
    public int minStartValue(int[] nums) {
        int currSum = 0;
        int min = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            min = Math.min(min, currSum);
        }
        if (min > 0)
            return 1;
        return Math.abs(min) + 1;
    }
}
/**
 * [2, 0, -3] : 4
 * [5, 3, 0]
 */