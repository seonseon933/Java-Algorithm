package Sliding_Window.p1004_Max_Consecutive_Ones_III;

public class p1004_Max_Consecutive_Ones_III {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int curr = 0;
        int res = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                curr++;
            }
            while (curr > k) {
                if (nums[left] == 0) {
                    curr--;
                }
                left++;
            }
            res = Math.max(res, right - left + 1);
        }
        return res;
    }
}