package Dynamic_Programming.p322_Coin_Change;

import java.util.Arrays;

public class p322_Coin_Change {
    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, amount + 1);

        memo[0] = 0;

        for(int i = 1; i <= amount; i++) {
            for(int coin : coins) {
                if(i >= coin) memo[i] = Math.min(memo[i - coin] + 1, memo[i]);
            }
        }

        return (memo[amount] > amount) ? -1 : memo[amount];
    }
}