package com.company.arrays;

public class BestTimeToBuyAndSellStock {
    private static int maxProfit(int[] prices){
        int maxProfit = 0;
        int globalMax = 0;
        int globalMin = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] > globalMax) {
                globalMax = prices[i];
            }


            if (prices[i] < globalMin) {
                globalMin = prices[i];
                globalMax = prices[i];
            }

            maxProfit = Math.max(maxProfit, globalMax - globalMin);
        }

        return maxProfit;


    }
    public static void main(String[] args){

        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));

    }
}
