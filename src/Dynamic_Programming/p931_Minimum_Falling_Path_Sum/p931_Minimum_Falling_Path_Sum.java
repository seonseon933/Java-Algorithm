package Dynamic_Programming.p931_Minimum_Falling_Path_Sum;

import java.util.Arrays;

public class p931_Minimum_Falling_Path_Sum {

    int[][] memo;
    int n;
    int m;
    int[][] matrix;

    public int minFallingPathSum(int[][] matrix) {
        this.matrix = matrix;
        n = matrix.length;
        m = matrix[0].length;
        memo = new int[n][m];

        for(int i = 0; i < n; i++) {
            Arrays.fill(memo[i], Integer.MAX_VALUE);
        }

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < m; i++) {
            min = Math.min(min, dp(0, i));
        }

        return min;
    }

    public int dp(int i, int j) {
        if (i == n) return 0;
        if(j >= m || j < 0) return Integer.MAX_VALUE;
        if(memo[i][j] != Integer.MAX_VALUE) return memo[i][j];  

        int min = Math.min(dp(i + 1, j - 1), dp(i + 1, j));
        memo[i][j] = matrix[i][j] + Math.min(min, dp(i + 1, j + 1));

        return memo[i][j];
    }
}
