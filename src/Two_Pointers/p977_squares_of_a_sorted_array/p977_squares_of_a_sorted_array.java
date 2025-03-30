package Two_Pointers.p977_squares_of_a_sorted_array;

import java.util.Arrays;

public class p977_squares_of_a_sorted_array {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }

        Arrays.sort(nums);

        return nums;
    }
}
