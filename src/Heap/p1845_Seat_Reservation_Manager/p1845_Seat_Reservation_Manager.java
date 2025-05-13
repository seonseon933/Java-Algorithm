package Heap.p1845_Seat_Reservation_Manager;

import java.util.PriorityQueue;

public class p1845_Seat_Reservation_Manager {
    PriorityQueue<Integer> seat;

    public p1845_Seat_Reservation_Manager(int n) {
        seat = new PriorityQueue<>();
        for(int i = 1; i <= n; i++){
            seat.offer(i);
        }
    }

    public int reserve() {
        return seat.poll();
    }
    
    public void unreserve(int seatNumber) {
        seat.offer(seatNumber);
    }
}