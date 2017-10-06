package com.Microsoft.Medium;

import java.util.Scanner;

class TicTacToe {

	private int[] rows;
	private int[] columns;
	private int diagonal;
	private int antiDiagonal;

	/** Initialize your data structure here. */
	public TicTacToe(int n) {
		rows = new int[n];
		columns = new int[n];
	}

	/**
	 * Player {player} makes a move at ({row}, {col}).
	 * 
	 * @param row
	 *            The row of the board.
	 * @param col
	 *            The column of the board.
	 * @param player
	 *            The player, can be either 1 or 2.
	 * @return The current winning condition, can be either: 0: No one wins. 1:
	 *         Player 1 wins. 2: Player 2 wins.
	 */
	public int move(int row, int col, int player) {
		int gameResult = 0;
		int toAdd = player == 1 ? 1 : -1;

		rows[row] += toAdd;
		columns[col] += toAdd;

		if (row == col) {
			diagonal += toAdd;
		}

		if (col == (columns.length - row - 1)) {
			antiDiagonal += toAdd;
		}

		int size = rows.length;

		if (Math.abs(rows[row]) == size || Math.abs(columns[col]) == size || Math.abs(diagonal) == size
				|| Math.abs(antiDiagonal) == size) {
			return player;
		}

		return gameResult;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int boardSize = sc.nextInt();
		TicTacToe myObj = new TicTacToe(boardSize);
		int gameResult = 0;
		int row, column, player = 0;
		while (gameResult != 1) {
			row = sc.nextInt();
			column = sc.nextInt();
			player = sc.nextInt();
			gameResult = myObj.move(row, column, player);
		}
		sc.close();
		System.out.println("Player " + player + " won the game.");
	}
}

/**
 * Your TicTacToe object will be instantiated and called as such: TicTacToe obj
 * = new TicTacToe(n); int param_1 = obj.move(row,col,player);
 */