package com.Microsoft.Medium;

import java.util.Arrays;

public class BattleshipsOnBoard {

	public static void main(String[] args) {
		char[][] board = new char[][] { { 'X', '.', '.', 'X' }, { 'X', '.', '.', '.' }, { 'X', '.', '.', 'X' } };
		int result = countBattleships(board);
		for (int i = 0; i < board.length; i++) {
			System.out.println(Arrays.toString(board[i]));
		}
		System.out.println(result);
	}

	private static int countBattleships(char[][] board) {
		int m = board.length;
		if (m == 0) {
			return 0;
		}
		int n = board[0].length;
		int count = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (board[i][j] == '.') {
					continue;
				}
				if (i > 0 && board[i - 1][j] == 'X') {
					continue;
				}
				if (j > 0 && board[i][j - 1] == 'X') {
					continue;
				}
				count++;
			}
		}
		return count;
	}

}
