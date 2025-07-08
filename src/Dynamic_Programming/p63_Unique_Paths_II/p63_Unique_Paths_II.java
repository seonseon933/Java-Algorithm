package Dynamic_Programming.p63_Unique_Paths_II;

import java.util.Arrays;

public class p63_Unique_Paths_II {
    
    int[][] memo;
    int n;
    int m;
    int[][] obstacleGrid;

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        n = obstacleGrid.length;
        m = obstacleGrid[0].length; 

        memo = new int[n][m];
        for(int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }

        this.obstacleGrid = obstacleGrid;
        
        return dp(0, 0);
    }

    public int dp(int i, int j) {
        if(i == n - 1 && j == m - 1) return obstacleGrid[i][j] == 0 ? 1 : 0;
        if(i >= n || j >= m) return 0;
        if(obstacleGrid[i][j] == 1) return 0;
        if(memo[i][j] != -1) return memo[i][j];
    
        memo[i][j] = dp(i + 1, j) + dp(i, j + 1);
        return memo[i][j];
    }
}