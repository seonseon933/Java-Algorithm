package Hashing.More_hashing_examples.p771_Jewels_and_Stones;

import java.util.HashSet;
import java.util.Set;

public class p771_Jewels_and_Stones {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        int ctn = 0;

        for(char c : jewels.toCharArray()){
            jewelSet.add(c);
        }

        for(char c : stones.toCharArray()){
            if(jewelSet.contains(c)){
                ctn++;
            }
        }
        return ctn;
    }
}
