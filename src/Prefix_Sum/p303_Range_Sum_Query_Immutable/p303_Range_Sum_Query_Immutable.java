package Prefix_Sum.p303_Range_Sum_Query_Immutable;

public class p303_Range_Sum_Query_Immutable {
    public int[] ps;

    public p303_Range_Sum_Query_Immutable(int[] nums) {
        ps = new int[nums.length];
        ps[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            ps[i] = ps[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0)
            return ps[right];
        return ps[right] - ps[left - 1];
    }
}
/*
 * [-2, 0, 3, -5, 2, -1] -> [-2, -2, 1, -4, -2, -3]
 * sumRange(0, 2) -> -2+0+3 == 누적합의 2번째
 * sumRange(2, 5) -> 3-5+2-1 == -3 - -2 = -1
 * 
 * [3,2,5,1,4] -> [3,5,10,11,15], (2,4)? -> 누적합4번째 - 누적합1번째
 * = 15 - 5 = 10
 * 
 */