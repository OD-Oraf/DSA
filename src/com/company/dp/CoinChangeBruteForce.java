package com.company.dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CoinChangeBruteForce {
    public static void main(String[] args) {
        int[] coins = new int[]{1,2,5};
        int amount = 11;
        int res = recursion(coins, amount);
        System.out.println(res);
    }
    public static int recursion(int[] coins, int remain) {
        if (remain < 0) return -1;
        if (remain == 0) return 0;

        int minCount = Integer.MAX_VALUE;
        for (int coin : coins) {
            int count = recursion(coins, remain - coin);
            if (count == -1) continue;
            minCount = Math.min(minCount, count + 1);
        }

        return minCount == Integer.MAX_VALUE ? -1 : minCount;
    }
}
