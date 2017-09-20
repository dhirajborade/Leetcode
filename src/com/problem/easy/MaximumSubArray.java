package com.problem.easy;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] myArray = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(myArray));
	}

	private static int maxSubArray(int[] myArray) {
//		int maxSoFar = myArray[0], maxEndingHere = myArray[0];
//		for (int i = 1; i < myArray.length; ++i) {
//			maxEndingHere = Math.max(maxEndingHere + myArray[i], myArray[i]);
//			maxSoFar = Math.max(maxSoFar, maxEndingHere);
//		}
//		return maxSoFar;
		
		int[] dp = new int[myArray.length];
		dp[0] = myArray[0];
		int max = dp[0];
		
		for (int i = 1; i < myArray.length; i++) {
			dp[i] = myArray[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
			max = Math.max(max, dp[i]);
		}
		
		return max;
	}

}
