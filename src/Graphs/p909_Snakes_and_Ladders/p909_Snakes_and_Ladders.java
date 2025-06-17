package Graphs.p909_Snakes_and_Ladders;

import java.util.LinkedList;
import java.util.Queue;

public class p909_Snakes_and_Ladders {
    public class State{
        int num;
        int steps;

        public State(int num, int steps) {
            this.num = num;
            this.steps = steps;
        }
    }
    
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean[] seen = new boolean[n * n + 1];
        Queue<State> q = new LinkedList<>();
        int[][] pos = new int[n*n+1][2];
        int k = 1;
        boolean left = true;
        for(int i = n - 1; i >= 0; i--) {
            if(left) {
                for(int j = 0; j < n; j++) {
                    pos[k++] = new int[]{i, j};
                }
            }else{
                for(int j = n - 1; j >= 0; j--) {
                    pos[k++] = new int[]{i, j};
                }
            }
            left = !left;
        }
        
        seen[1] = true;
        q.offer(new State(1, 0));
        
        while (!q.isEmpty()) {
            State state = q.remove();
            int num = state.num;
            int step = state.steps;

            if(num == n * n) return step;

            for(int i = 1; i <= 6 && num + i <= n*n; i++) {
                int next = num + i;
                int row = pos[next][0], col = pos[next][1];
                
                if(board[row][col] != -1) {
                    next = board[row][col];
                }
                if(!seen[next]) {
                    seen[next] = true;
                    q.offer(new State(next, step + 1));
                }
            }
        }
        return -1;
    }
}
