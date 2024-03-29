/**
 *  682. Baseball Game
 *
 *  You are keeping the scores for a baseball game with strange rules. At
 *  the beginning of the game, you start with an empty record.
 *
 *  You are given a list of strings operations, where operations[i] is the
 *  ith operation you must apply to the record and is one of the following:
 *
 *  - An integer x.
 *      - Record a new score of x.
 *
 *  - '+'.
 *      - Record a new score that is the sum of the previous two scores.
 *
 *  - 'D'.
 *      - Record a new score that is the double of the previous score.
 *
 *  - 'C'.
 *      - Invalidate the previous score, removing it from the record.
 *
 *  Return the sum of all the scores on the record after applying all the operations.
 *
 *  The test cases are generated such that the answer and all intermediate
 *  calculations fit in a 32-bit integer and that all operations are valid.
 *
 */

import java.util.Stack;

public class Problem682 {

    public int calPoints(String[] operations) {

        Stack<String> strings = new Stack<>();

        for (String s : operations) {
            if (s.equals("C")) {
                strings.pop();
            } else if (s.equals("D")) {
                int v = Integer.parseInt(strings.peek());
                strings.add(String.valueOf(v * 2));
            } else if (s.equals("+")) {
                int v2 = Integer.parseInt(strings.pop());
                int v1 = Integer.parseInt(strings.pop());
                strings.add(String.valueOf(v1));
                strings.add(String.valueOf(v2));
                strings.add(String.valueOf(v1 + v2));
            } else {
                strings.add(s);
            }
        }

        int result = 0;
        for (String s : strings) { result += Integer.parseInt(s); }

        return result;
    }

    public int calPoints1(String[] operations) {

        int[] resultArr = new int[operations.length];
        int idx = 0;

        for (String operation : operations) {
            if (operation.equals("+")) {
                resultArr[idx] = resultArr[idx - 1] + resultArr[idx - 2];
                idx++;
            } else if (operation.equals("C")) {
                idx--;
            } else if (operation.equals("D")) {
                resultArr[idx] = resultArr[idx-1] * 2;
                idx++;
            } else {
                resultArr[idx++] = Integer.parseInt(operation);
            }
        }

        int result = 0;
        for (int i=0; i<idx; i++) result += resultArr[i];

        return result;
    }
}
