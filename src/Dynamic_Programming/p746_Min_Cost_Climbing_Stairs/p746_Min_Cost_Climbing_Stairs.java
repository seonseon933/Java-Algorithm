package Dynamic_Programming.p746_Min_Cost_Climbing_Stairs;

import java.util.HashMap;
import java.util.Map;

public class p746_Min_Cost_Climbing_Stairs {
    Map<Integer, Integer> map = new HashMap<>();

    public int minCostClimbingStairs(int[] cost) {
        return dp(cost.length, cost);
    }

    public int dp(int index, int[] cost) {
        if(index <= 1) return 0;
        
        if(map.containsKey(index)) return map.get(index);

        map.put(index, Math.min(dp(index - 1, cost) + cost[index - 1], dp(index - 2, cost) + cost[index - 2]));
        return map.get(index);
    }
}