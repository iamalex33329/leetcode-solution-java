/**
 *  1845. Seat Reservation Manager
 *
 *  Design a system that manages the reservation state of n seats that
 *  are numbered from 1 to n.
 *
 *  Implement the SeatManager class:
 *
 *    - SeatManager(int n) Initializes a SeatManager object that will manage
 *      n seats numbered from 1 to n. All seats are initially available.
 *
 *    - int reserve() Fetches the smallest-numbered unreserved seat, reserves
 *      it, and returns its number.
 *
 *    - void unreserve(int seatNumber) Unreserves the seat with the given
 *      seatNumber.
 *
 */

import java.util.PriorityQueue;

public class Problem1845 {

    class SeatManager {

        PriorityQueue<Integer> freeQueue;

        public SeatManager(int n) {
            freeQueue = new PriorityQueue<>();
            for (int i=1; i<=n; i++) { freeQueue.add(i); }
        }

        public int reserve() {
            return freeQueue.poll();
        }

        public void unreserve(int seatNumber) {
            freeQueue.offer(seatNumber);
        }
    }

    class SeatManager1 {

        boolean[] seats;
        int reserved = 0;
        int min = 1;

        public SeatManager1(int n) {
            seats = new boolean[n+1];
        }

        public int reserve() {
            // 沒有人訂位
            if (reserved == 0) {
                seats[min] = true;
                return min++;
            }

            for (int i=1; i<seats.length; i++) {
                if (!seats[i]) {
                    seats[i] = true;
                    reserved++;
                    return i;
                }
            }
            return -1;
        }

        public void unreserve(int seatNumber) {
            seats[seatNumber] = false;
            reserved--;
        }
    }
}
