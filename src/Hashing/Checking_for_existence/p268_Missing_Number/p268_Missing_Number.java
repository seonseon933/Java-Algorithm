package Hashing.Checking_for_existence.p268_Missing_Number;

import java.util.HashSet;

public class p268_Missing_Number {
    public int missingNumber(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i = 0; i <= nums.length; i++) {
            if (!set.contains(i))
                return i;
        }
        return -1;
    }
}
