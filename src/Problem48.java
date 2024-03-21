/**
 *  48. Rotate Image
 *
 *  You are given an n x n 2D matrix representing an image, rotate
 *  the image by 90 degrees (clockwise).
 *
 *  You have to rotate the image in-place, which means you have to
 *  modify the input 2D matrix directly. DO NOT allocate another 2D
 *  matrix and do the rotation.
 *
 */

public class Problem48 {

    public void rotate(int[][] matrix) {
        int tmpMatrix[][] = new int[matrix.length][matrix.length];

        for (int i=matrix.length-1; i>=0; i--) {
            for (int j=0; j<matrix.length; j++) {
                tmpMatrix[i][j] = matrix[matrix.length-1-j][i];
            }
        }

        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix.length; j++) {
                matrix[i][j] = tmpMatrix[i][j];
            }
        }
    }
}
