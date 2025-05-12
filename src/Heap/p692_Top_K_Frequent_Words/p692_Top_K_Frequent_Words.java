package Heap.p692_Top_K_Frequent_Words;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class p692_Top_K_Frequent_Words {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> freq = new HashMap<>();
        PriorityQueue<String> heap = new PriorityQueue<>(
            (w1, w2) -> {
                int freq1 = freq.get(w1);
                int freq2 = freq.get(w2);
                if (freq1 != freq2) {
                    return freq1 - freq2; 
                } else {
                    return w2.compareTo(w1); 
                }
            }
        );

        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        for (String word : freq.keySet()) {
            heap.add(word);
            if (heap.size() > k) {
                heap.poll();
            }
        }
        
        LinkedList<String> res = new LinkedList<>();
        while(!heap.isEmpty()) {
            res.addFirst(heap.poll());
        }
        return res;
    }
}
