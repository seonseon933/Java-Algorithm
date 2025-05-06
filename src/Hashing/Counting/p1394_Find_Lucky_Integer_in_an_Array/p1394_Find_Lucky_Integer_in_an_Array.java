package Hashing.Counting.p1394_Find_Lucky_Integer_in_an_Array;

import java.util.HashMap;
import java.util.Map;

public class p1394_Find_Lucky_Integer_in_an_Array {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> lucky = new HashMap<>();
        int max = -1;

        for(int n : arr){
            lucky.put(n, lucky.getOrDefault(n, 0) + 1);
        }

        for(int n : lucky.keySet()){
            int i = lucky.get(n);
            if(n == i) max = Math.max(i, max);
        }
        return max;
    }
}