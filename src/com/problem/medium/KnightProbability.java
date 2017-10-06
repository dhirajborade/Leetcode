package com.problem.medium;

public class KnightProbability {

	public static void main(String[] args) {
		int N = 3;
		int K = 2;
		int sr = 0;
		int sc = 0;
		double result = knightProbability(N, K, sc, sr);
		System.out.println(result);
	}

	static int[] dr = new int[] { -2, -1, 1, 2, -2, -1, 1, 2 };
	static int[] dc = new int[] { 1, 2, 2, 1, -1, -2, -2, -1 };

	public static double knightProbability(int N, int K, int r, int c) {
		double[][][] dp = new double[N][N][K + 1];
		double count = helper(N, K, r, c, dp);
		return count;
	}

	private static double helper(int N, int K, int r, int c, double[][][] dp) {
		if (K == 0) {
			return 1.0;
		}

		if (dp[r][c][K] != 0) {
			return dp[r][c][K];
		}

		double count = 0;
		for (int i = 0; i < 8; i++) {
			int nextR = r + dr[i];
			int nextC = c + dc[i];
			if (nextR >= 0 && nextR < N && nextC >= 0 && nextC < N) {
				count += 1.0 / 8 * helper(N, K - 1, nextR, nextC, dp);
			}
		}
		dp[r][c][K] = count;
		return count;
	}

	// public static double knightProbability(int N, int K, int sr, int sc) {
	// double[][] dp = new double[N][N];
	// int[] dr = new int[]{2, 2, 1, 1, -1, -1, -2, -2};
	// int[] dc = new int[]{1, -1, 2, -2, 2, -2, 1, -1};
	//
	// dp[sr][sc] = 1;
	// for (; K > 0; K--) {
	// double[][] dp2 = new double[N][N];
	// for (int r = 0; r < N; r++) {
	// for (int c = 0; c < N; c++) {
	// for (int k = 0; k < 8; k++) {
	// int cr = r + dr[k];
	// int cc = c + dc[k];
	// if (0 <= cr && cr < N && 0 <= cc && cc < N) {
	// dp2[cr][cc] += dp[r][c] / 8.0;
	// }
	// }
	// }
	// }
	// dp = dp2;
	// }
	// double ans = 0.0;
	// for (double[] row: dp) {
	// for (double x: row) ans += x;
	// }
	// return ans;
	// }
}
