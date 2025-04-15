package Hashing.Checking_for_existence.p1426_Counting_Elements;

import java.util.HashSet;

public class p1426_Counting_Elements {
    public int countElements(int[] arr) {
        int ctn = 0;
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] + 1))
                ctn++;
        }
        return ctn;
    }
}
