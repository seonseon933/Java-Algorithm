package Heap.Top_K.p973_K_Closest_Points_to_Origin;

import java.util.PriorityQueue;

public class p973_K_Closest_Points_to_Origin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> heap = new PriorityQueue<>((n1, n2) -> 
            (n1[0]*n1[0] + n1[1]*n1[1]) - (n2[0]*n2[0] + n2[1]*n2[1]));
        
        for(int[] n : points){
            heap.add(n);
        }
        
        int[][] res = new int[k][2];
        for(int i = 0; i < k; i++) {
            res[i] = heap.poll(); 
        }
        return res;
    }
}
