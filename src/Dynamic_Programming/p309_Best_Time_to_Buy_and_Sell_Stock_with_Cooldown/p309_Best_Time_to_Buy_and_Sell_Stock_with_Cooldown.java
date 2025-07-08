package Dynamic_Programming.p309_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown;

import java.util.Arrays;

public class p309_Best_Time_to_Buy_and_Sell_Stock_with_Cooldown {

    int[][] memo;
    int n;
    int[] prices;

    public int maxProfit(int[] prices) {
        n = prices.length;
        memo = new int[n][3];

        for(int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }

        this.prices = prices;

        return dp(0, 0);
    }

    public int dp(int i, int state) {
        if(i >= n) return 0;
        if(memo[i][state] != -1) return memo[i][state];
        
        int ans = 0;
        
        if(state == 0) {
            int b = -prices[i] + dp(i + 1, 1);
            int r = dp(i + 1, 0);
            ans = Math.max(b, r);
        } else if(state == 1) {
            int s = prices[i] + dp(i + 1, 2);
            int r = dp(i + 1, 0);
            ans = Math.max(s, r);
        } else{
            ans = dp(i + 1, 1);
        }

        memo[i][state] = ans; 
        return ans;
    }
}
