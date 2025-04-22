package Hashing.More_hashing_examples.p2352_Equal_Row_and_Column_Pairs;

import java.util.HashMap;
import java.util.Map;

public class p2352_Equal_Row_and_Column_Pairs {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> row = new HashMap<>();
        int cnt = 0;
        int num = grid.length;

        for(int i = 0; i < num; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < num; j++){
                sb.append(grid[i][j]).append(",");
            }
            row.put(sb.toString(), row.getOrDefault(sb.toString(), 0) + 1);
        }

        for(int j = 0; j < num; j++){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < num; i++){
                sb.append(grid[i][j]).append(",");
            }
            cnt += row.getOrDefault(sb.toString(), 0);
        }
        return cnt;
    }
}
