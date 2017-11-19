package com.problem.easy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ClimbingStaircase {

	public static void main(String[] args) {
		assertThat(climbStairsMemoization(20), is(10946));
		assertThat(climbStairsFibFormula(20), is(10946));
		assertThat(climbStairsDynamicProgramming(20), is(10946));
		assertThat(climbStairsFibSeries(20), is(10946));
		System.out.println("All Test Cases passed");
	}

	private static int climbStairsMemoization(int n) {
		int[] dp = new int[n + 1];
		return climbStairsMemoizationHelper(0, n, dp);
	}

	private static int climbStairsMemoizationHelper(int i, int n, int[] dp) {
		if (i > n)
			return 0;

		if (i == n)
			return 1;

		if (dp[i] > 0)
			return dp[i];

		dp[i] = climbStairsMemoizationHelper(i + 1, n, dp) + climbStairsMemoizationHelper(i + 2, n, dp);

		return dp[i];
	}

	private static int climbStairsFibFormula(int n) {
		double sqrt5 = Math.sqrt(5);
		double fibN = Math.pow((1 + sqrt5) / 2, n + 1) - Math.pow((1 - sqrt5) / 2, n + 1);
		return (int) (fibN / sqrt5);
	}

	private static int climbStairsDynamicProgramming(int n) {
		if (n == 1) {
			return 1;
		}
		int[] dp = new int[n + 1];
		dp[1] = 1;
		dp[2] = 2;
		for (int i = 3; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		return dp[n];
	}
	
	private static int climbStairsFibSeries(int n) {
		if (n == 1) {
			return 1;
		}
		
		int first = 1;
		int second = 2;
		
		for (int i = 3; i <= n; i++) {
			int result = first + second;
			first = second;
			second = result;
		}
		
		return second;
	}

}
