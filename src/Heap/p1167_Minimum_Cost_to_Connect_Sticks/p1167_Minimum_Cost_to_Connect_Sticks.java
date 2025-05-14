package Heap.p1167_Minimum_Cost_to_Connect_Sticks;

import java.util.PriorityQueue;

public class p1167_Minimum_Cost_to_Connect_Sticks {
    public int connectSticks(int[] sticks){
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        int cost = 0;

        for(int n : sticks){
            heap.add(n);
        }

        while(heap.size() > 1){
            int sum = heap.poll() + heap.poll();
            heap.add(sum);
            cost += sum; 
        }
        return cost;
    }
}
