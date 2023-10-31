/**
 *  36. Valid Sudoku
 *
 *  Determine if a 9 x 9 Sudoku board is valid. Only the filled
 *  cells need to be validated according to the following rules:
 *
 *   1. Each row must contain the digits 1-9 without repetition.
 *   2. Each column must contain the digits 1-9 without repetition.
 *   3. Each of the nine 3 x 3 sub-boxes of the grid must contain
 *      the digits 1-9 without repetition.
 *
 */

import java.util.HashSet;
import java.util.Set;

public class Problem36 {

    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();
        for (int i=0; i<9; ++i) {
            for (int j=0; j<9; ++j) {
                char number = board[i][j];
                if (number != '.')
                    if (!seen.add(number + " in row " + i) ||
                            !seen.add(number + " in column " + j) ||
                            !seen.add(number + " in block " + i/3 + "-" + j/3))
                        return false;
            }
        }
        return true;
    }
}
