package Heap.p1962_Remove_Stones_to_Minimize_the_Total;

import java.util.Comparator;
import java.util.PriorityQueue;

public class p1962_Remove_Stones_to_Minimize_the_Total {
    public int minStoneSum(int[] piles, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        int res = 0;

        for(int n : piles){
            heap.add(n);
        }

        for(int i = 0; i < k; i++){
            heap.add((heap.poll() + 1) / 2);
        }

        while(!heap.isEmpty()){
            res += heap.poll();
        }
        return res;
    }
}
