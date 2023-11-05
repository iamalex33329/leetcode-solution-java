/**
 *  1535. Find the Winner of an Array Game
 *
 *  Given an integer array arr of distinct integers and an integer k.
 *
 *  A game will be played between the first two elements of the array
 *  (i.e. arr[0] and arr[1]). In each round of the game, we compare arr[0]
 *  with arr[1], the larger integer wins and remains at position 0, and
 *  the smaller integer moves to the end of the array. The game ends when
 *  an integer wins k consecutive rounds.
 *
 *  Return the integer which will win the game.
 *
 *  It is guaranteed that there will be a winner of the game.
 *
 */

    public class Problem1535 {

        public int getWinner(int[] arr, int k) {
            int winner = arr[0], winRound = 0;

            for (int i=1; i<arr.length; i++) {
                if (arr[i] > winner) {
                    winner = arr[i];
                    winRound = 1;
                }
                if (winRound++ == k) break;
            }
            return winner;
        }
    }
