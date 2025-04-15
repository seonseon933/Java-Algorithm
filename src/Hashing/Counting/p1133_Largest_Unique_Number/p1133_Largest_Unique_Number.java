package Hashing.Counting.p1133_Largest_Unique_Number;

import java.util.HashMap;
import java.util.Map;

public class p1133_Largest_Unique_Number {
    public int largestUniqueNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int max = -1;

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for (int k : map.keySet()) {
            if (map.get(k) == 1) {
                max = Math.max(max, k);
            }
        }
        return max;
    }
}
