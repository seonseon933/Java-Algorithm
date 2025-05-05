package Hashing.Checking_for_existence.p217_Contains_Duplicate;

import java.util.HashSet;
import java.util.Set;

public class p217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
