package com.company.dp;

import java.util.Arrays;

public class CoinChange {

    public static int coinChange(int[] coins, int amount){
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        // Base case- 0 ways to make amount 0
        dp[0] = 0;

        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        return dp[amount] > amount ? -1 : dp[amount];
    }
    public static void main(String[] args){
        int[] coins = new int[]{1, 3, 4, 5};
        int amount = 11;

        System.out.println(coinChange(coins, amount));
    }
}
