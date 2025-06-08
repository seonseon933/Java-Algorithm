package Graphs.p695_Max_Area_of_Island;

public class p695_Max_Area_of_Island {
    int[][] direcs = new int[][]{{0,1}, {1,0}, {0,-1}, {-1, 0}};
    boolean[][] seen;
    int m;
    int n;
    int max = 0;

    public int maxAreaOfIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        seen = new boolean[m][n];
        
        for(int row = 0; row < m; row++) {
            for(int col = 0; col < n; col++) {
                if(grid[row][col] == 1 && !seen[row][col]) {
                    seen[row][col] = true;
                    max = Math.max(dfs(row, col, grid), max);
                }
            }
        }
        return max;        
    }

    private int dfs(int row, int col, int[][] grid) {
        int num = 1;
        for(int[] direc : direcs){
            int nextRow = row + direc[0];
            int nextCol = col + direc[1];

            if(valid(nextRow, nextCol, grid) && !seen[nextRow][nextCol]) {
                seen[nextRow][nextCol] = true;
                num += dfs(nextRow, nextCol, grid);
            }
        }
        return num;
    }

    private boolean valid(int row, int col, int[][] grid) {
        return 0 <= row && row < m && 0 <= col && col < n && grid[row][col] == 1;
    }
}
