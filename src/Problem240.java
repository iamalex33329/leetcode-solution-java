/**
 *  240. Search a 2D Matrix II
 *
 *  Write an efficient algorithm that searches for a value target in an m x n
 *  integer matrix. This matrix has the following properties:
 *
 *  - Integers in each row are sorted in ascending from left to right.
 *
 *  - Integers in each column are sorted in ascending from top to bottom.
 *
 */

public class Problem240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                row++;
            }
        }

        return false;
    }
}
