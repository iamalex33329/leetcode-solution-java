/**
 *  118. Pascal's Triangle
 *
 *  Given an integer numRows, return the first numRows of Pascal's triangle.
 *
 *  In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *
 *         1
 *       1   1
 *     1  2 2  1
 *   1  3  4  3  1
 *
 */

import java.util.ArrayList;
import java.util.List;

public class Problem118 {

    public List<List<Integer>> generate(int numRows) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            List<List<Integer>> results = new ArrayList<>();
            results.add(newRow);

            for (int i=1; i<numRows; i++) {
                List<Integer> prevRow = results.get(i-1);

                newRow = new ArrayList<>();
                // generate new row
                newRow.add(1);
                for (int j=1; j<prevRow.size(); j++) { newRow.add(prevRow.get(j-1) + prevRow.get(j)); }
                newRow.add(1);

                results.add(newRow);
            }

            return results;
    }
}