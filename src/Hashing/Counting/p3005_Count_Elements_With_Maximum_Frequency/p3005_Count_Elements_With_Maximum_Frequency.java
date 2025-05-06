package Hashing.Counting.p3005_Count_Elements_With_Maximum_Frequency;

import java.util.HashMap;
import java.util.Map;

public class p3005_Count_Elements_With_Maximum_Frequency {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int max = 0, res = 0;

        for(int n : nums){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
            max = Math.max(max, freq.get(n));
        }

        for(int n : freq.keySet()){
            int value = freq.get(n);
            if(value == max) res += value; 
        }
        return res;
    }
}