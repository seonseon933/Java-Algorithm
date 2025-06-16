package Graphs.p1926_Nearest_Exit_from_Entrance_in_Maze;

import java.util.LinkedList;
import java.util.Queue;

public class p1926_Nearest_Exit_from_Entrance_in_Maze {
    public class State{
        int row;
        int col;
        int steps;

        public State(int row, int col, int steps) {
            this.row = row;
            this.col = col;
            this.steps = steps;
        }
    }

    int n;
    int m;
    int [][] direcs = new int[][]{{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    public int nearestExit(char[][] maze, int[] entrance) {
        n = maze.length;
        m = maze[0].length;
        boolean[][] seen = new boolean[n][m];
        Queue<State> q = new LinkedList<>();

        seen[entrance[0]][entrance[1]] = true;
        q.offer(new State(entrance[0], entrance[1], 0));

        while (!q.isEmpty()) {
            State state = q.remove();
            int row = state.row;
            int col = state.col;
            int step = state.steps;

            if(!(row == entrance[0] && col == entrance[1]) 
                && (row == 0 || row == (n - 1) || col == 0 || col == (m - 1))) {
                return step;
            }

            for(int[] direc : direcs) {
                int nRow = row + direc[0], nCol = col + direc[1];

                if(valid(nRow, nCol, maze) && !seen[nRow][nCol]) {
                    seen[nRow][nCol] = true;
                    q.offer(new State(nRow, nCol, step + 1));
                }
            }
        }

        return -1;
    }

    private boolean valid(int row, int col, char[][] grid) {
        return 0 <= row && row < n && 0 <= col && col < m && grid[row][col] == '.';
    }
}
