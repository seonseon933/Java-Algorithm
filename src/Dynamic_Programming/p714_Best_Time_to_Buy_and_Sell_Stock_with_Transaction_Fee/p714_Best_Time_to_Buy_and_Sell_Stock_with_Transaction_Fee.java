package Dynamic_Programming.p714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee;

import java.util.Arrays;

public class p714_Best_Time_to_Buy_and_Sell_Stock_with_Transaction_Fee {
    
    int[][] memo;
    int n;
    int[] prices;

    public int maxProfit(int[] prices, int fee) {
        n = prices.length;
        memo = new int[n][2];
        for(int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }
        this.prices = prices;
        return dp(0, 0, fee);
    }

    public int dp(int i, int holding, int fee) {
        if(i == n) return 0;
        if(memo[i][holding] != -1) return memo[i][holding];

        int ans = dp(i + 1, holding, fee);
        if(holding == 1) {
            ans = Math.max(ans, prices[i] - fee + dp(i + 1, 0, fee));
        }else{
            ans = Math.max(ans, -prices[i] + dp(i + 1, 1, fee));
        }

        memo[i][holding] = ans;
        return ans;
    
    }
}
