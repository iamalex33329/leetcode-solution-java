package medium;

public class Problem200 {
    private int row, col;

    public int numIslands(char[][] grid) {
        int count = 0;

        row = grid.length;  col = grid[0].length;

        if (row == 0) return 0;

        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }

    private void dfs(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= row || j >= col || grid[i][j] != '1') return;
        grid[i][j] = '0';

        dfs(grid, i+1, j);
        dfs(grid, i-1, j);
        dfs(grid, i, j+1);
        dfs(grid, i, j-1);
    }
}
