package Heap.Top_K.p215_Kth_Largest_Element_in_an_Array;

import java.util.PriorityQueue;

public class p215_Kth_Largest_Element_in_an_Array {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int n : nums){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }
        return heap.peek();
    }
}
