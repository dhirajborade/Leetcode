package com.problem.easy;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[] myArray = new int[] { 2, 3, -2, -1, 10 };
		System.out.println(maxSubArray(myArray));
	}

	private static int maxSubArray(int[] myArray) {
		// int maxSoFar = myArray[0], maxEndingHere = myArray[0];
		// for (int i = 1; i < myArray.length; ++i) {
		// maxEndingHere = Math.max(maxEndingHere + myArray[i], myArray[i]);
		// maxSoFar = Math.max(maxSoFar, maxEndingHere);
		// }
		// return maxSoFar;

		// int[] dp = new int[myArray.length];
		// dp[0] = myArray[0];
		// int max = dp[0];
		//
		// for (int i = 1; i < myArray.length; i++) {
		// dp[i] = myArray[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
		// max = Math.max(max, dp[i]);
		// }
		//
		// return max;

		int[] tempArray = new int[myArray.length];
		int maxSum = tempArray[0] = myArray[0];

		int indexI = 1;

		while (indexI < myArray.length) {
			if (tempArray[indexI - 1] > 0) {
				tempArray[indexI] = myArray[indexI] + tempArray[indexI - 1];
			} else {
				tempArray[indexI] = myArray[indexI] + 0;
			}
			maxSum = Math.max(maxSum, tempArray[indexI]);
			indexI++;
		}

		return maxSum;
	}

}
