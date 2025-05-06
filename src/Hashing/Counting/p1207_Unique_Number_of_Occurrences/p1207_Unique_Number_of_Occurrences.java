package Hashing.Counting.p1207_Unique_Number_of_Occurrences;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p1207_Unique_Number_of_Occurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for(int n : arr){
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        Set<Integer> set = new HashSet<>();
        for(int n : freq.values()){
            if(!set.add(n)) return false;
        }
        return true;
    }
}
