package Hashing.Counting.p525_Contiguous_Array;

import java.util.HashMap;
import java.util.Map;

public class p525_Contiguous_Array {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // 키: 누적합, 값: 인덱스임.
        int sum = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                nums[i] = -1;
        }

        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                int index = map.get(sum);
                max = Math.max(max, i - index);
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
// [0,1,0] -> [-1,1,-1]. 누적합: [-1,0,-1]
// 누적합[2] - 누적합[0] = nums[1] + nums[2]