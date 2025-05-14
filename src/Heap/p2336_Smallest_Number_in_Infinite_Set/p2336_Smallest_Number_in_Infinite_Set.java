package Heap.p2336_Smallest_Number_in_Infinite_Set;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class p2336_Smallest_Number_in_Infinite_Set {
    PriorityQueue<Integer> heap;
    Set<Integer> set;
    int next;
    
    public p2336_Smallest_Number_in_Infinite_Set() {
        heap = new PriorityQueue<>();
        set = new HashSet<>();
        next = 1;
    }
    
    public int popSmallest() {
        if(!heap.isEmpty()){
            int num = heap.poll();
            set.remove(num);
            return num;
        }
        return next++;
    }
    
    public void addBack(int num) {
        if(num < next && set.add(num)){
            heap.offer(num);
        }
    }
}
