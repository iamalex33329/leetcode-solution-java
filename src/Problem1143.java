/**
 *  1143. Longest Common Subsequence
 *
 *  Given two strings text1 and text2, return the length
 *  of their longest common subsequence. If there is no
 *  common subsequence, return 0.
 *
 *  A subsequence of a string is a new string generated
 *  from the original string with some characters (can
 *  be none) deleted without changing the relative order
 *  of the remaining characters.
 *
 *  For example, "ace" is a subsequence of "abcde".
 *  A common subsequence of two strings is a subsequence
 *  that is common to both strings.
 *
 */

import java.util.Arrays;

public class Problem1143 {

    public int longestCommonSubsequence(String text1, String text2) {

        int[][] grid = new int[text1.length() + 1][text2.length() + 1];

        for (int i=0; i<grid.length; i++) { grid[i][0] = 0; }
        Arrays.fill(grid[0], 0);

        for (int i=1; i<grid.length; i++) {
            for (int j=1; j<grid[0].length; j++) {
                if (text1.charAt(i-1) == text2.charAt(j-1)) {
                    grid[i][j] = grid[i-1][j-1] + 1;
                } else {
                    grid[i][j] = Math.max(grid[i-1][j], grid[i][j-1]);
                }
            }
        }

        return grid[text1.length()][text2.length()];
    }
}
