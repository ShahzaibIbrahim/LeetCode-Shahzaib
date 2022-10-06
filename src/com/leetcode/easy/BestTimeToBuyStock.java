package com.leetcode.easy;

public class BestTimeToBuyStock {

    public int maxProfit2(int[] prices) {
        int result = 0;
        for(int i=0; i<prices.length; i++) {
            int maxProfit = 0;
            for(int j=i + 1; j<prices.length; j++) {
                if(prices[i] < prices[j]) {
                    maxProfit = Math.max(maxProfit, prices[j] - prices[i]);
                }
                result = Math.max(maxProfit, result);
            }
        }

        return result;
    }

    public int maxProfit(int[] prices) {
        int result = 0;
        int buyIndex = 0;

        for(int i=0; i<prices.length; i++) {
            if(prices[i] >= prices[buyIndex]) { // if price inreases then record the profit
                result = Math.max(result, prices[i] - prices[buyIndex]);
            } else { // else if prices drop then buy it
                buyIndex = i;
            }
        }

        return result;
    }

    /**
     * 7 7 = r(0)
     * 7 1 = r(0) -- Price Dropped -- Buy Index (1)
     * 1 5 = r(4)
     * 1 3 = r(4)
     * 1 6 = r(5)
     *
     */

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyStock().maxProfit(new int[]{7,2,5,8,1,6,4}));
        System.out.println(new BestTimeToBuyStock().maxProfit(new int[]{7,6,4,3,1}));
    }
}
