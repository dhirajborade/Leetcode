package com.Microsoft.Easy;

public class BuyAndSellStock {

	public static void main(String[] args) {
		int[] inputArray = { 7, 1, 5, 3, 6, 4 };
		int result = maxProfit(inputArray);
		System.out.println(result);
	}

	private static int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else if (prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}
		return maxProfit;
	}

}
