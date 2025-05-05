package Hashing.Counting.p1748_Sum_of_Unique_Elements;

import java.util.HashMap;
import java.util.Map;

public class p1748_Sum_of_Unique_Elements {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> ctn = new HashMap<>();
        int res = 0;

        for(int n : nums){
            ctn.put(n, ctn.getOrDefault(n, 0) + 1);
        } 
        
        for(int n : ctn.keySet()){
            if(ctn.get(n) == 1){
                res += n;
            }
        }
        return res;
    }
}
