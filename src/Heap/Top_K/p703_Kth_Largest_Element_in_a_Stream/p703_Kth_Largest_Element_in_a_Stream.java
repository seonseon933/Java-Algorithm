package Heap.Top_K.p703_Kth_Largest_Element_in_a_Stream;

import java.util.PriorityQueue;

public class p703_Kth_Largest_Element_in_a_Stream {
    private PriorityQueue<Integer> heap;
    private int k;

    public p703_Kth_Largest_Element_in_a_Stream(int k, int[] nums) {
        this.k = k;
        heap = new PriorityQueue<>();

        for (int num : nums) {
            add(num); 
        }
    }
    
    public int add(int val) {
        heap.add(val);

        if(heap.size() > k){
            heap.poll();
        }
        return heap.peek();
    }
}
