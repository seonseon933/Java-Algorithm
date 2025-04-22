package Hashing.More_hashing_examples.p3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashMap;
import java.util.Map;

public class p3_Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
    
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);
    
            if (map.containsKey(c) && map.get(c) >= left) {
                left = map.get(c) + 1;
            }
            map.put(c, right);
            
            max = Math.max(max, right - left + 1);
        }
        return max;
    }
}
// p w w p e w -> 두 번째 p는 포함되어 있지만, left보다 더 뒤에 있. -> if문에 걸리면x
// 0 1 2 3 4 5
// p w a w p e -> a도 포함되어야 함. 