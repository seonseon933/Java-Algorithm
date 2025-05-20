package Heap.p2182_Construct_String_With_Repeat_Limit;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class p2182_Construct_String_With_Repeat_Limit {
    public String repeatLimitedString(String s, int repeatLimit) {
        PriorityQueue<Character> heap = new PriorityQueue<>((a, b) -> b - a);
        Map<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        heap.addAll(map.keySet());

        while (!heap.isEmpty()) {
            char c = heap.poll();
            int cnt = map.get(c);
            int use = Math.min(cnt, repeatLimit);

            for(int i = 0; i < use; i++) sb.append(c);

            map.put(c, cnt - use);

            if(cnt > use) {
                if(heap.isEmpty()) break;

                char next = heap.poll();
                sb.append(next); 
                map.put(next, map.get(next) - 1);

                if (map.get(next) > 0) heap.offer(next);

                heap.offer(c);
            }
        }
        return sb.toString();
    }
}
