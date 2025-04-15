package Hashing.Counting.p1189_Maximum_Number_of_Balloons;

import java.util.HashMap;
import java.util.Map;

public class p1189_Maximum_Number_of_Balloons {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> charCnt = new HashMap<>();
        charCnt.put('b', 0);
        charCnt.put('a', 0);
        charCnt.put('l', 0);
        charCnt.put('o', 0);
        charCnt.put('n', 0);

        for (char c : text.toCharArray()) {
            if (charCnt.containsKey(c)) {
                charCnt.put(c, charCnt.get(c) + 1);
            }
        }

        return Math.min(
                Math.min(
                        Math.min(charCnt.get('b'), charCnt.get('a')),
                        Math.min(charCnt.get('l') / 2, charCnt.get('o') / 2)),
                charCnt.get('n'));
    }
}