package Dynamic_Programming.p70_Climbing_Stairs;

import java.util.HashMap;
import java.util.Map;

public class p70_Climbing_Stairs {
    Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        return dp(n);
    }

    public int dp(int n) {
        if(n <= 1) return 1;
        if(n == 2) return 2;

        if(map.containsKey(n)) return map.get(n);
        
        map.put(n, dp(n - 1) + dp(n - 2));
        return map.get(n);
    }
}
