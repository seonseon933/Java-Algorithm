package Hashing.Counting.p451_Sort_Characters_By_Frequency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class p451_Sort_Characters_By_Frequency {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        StringBuilder res = new StringBuilder();

        for(char c : s.toCharArray()){
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        
        List<Map.Entry<Character, Integer>> mapEntries = new ArrayList<>(freq.entrySet());
        mapEntries.sort((a, b) -> b.getValue() - a.getValue());

        for(Map.Entry<Character, Integer> mapEntry : mapEntries){
            res.append(mapEntry.getKey().toString().repeat(mapEntry.getValue()));   
        }
        return res.toString();
    }
}
// tree -> (t, 1), (r, 1), (e, 2). 정렬해야 하는 값들은 키,값 그대로 가지고 있어야 함. 