package com.problem.medium;

public class ValidSudoku {

	public static void main(String[] args) {
		char[][] board = { 
				{ '5', '3', '4', '6', '7', '8', '9', '1', '2' }, 
				{ '6', '7', '2', '1', '9', '5', '3', '4', '8' }, 
				{ '1', '9', '8', '3', '4', '2', '5', '6', '7' },
				{ '8', '5', '9', '7', '6', '1', '4', '2', '3' }, 
				{ '4', '2', '6', '8', '5', '3', '7', '9', '1' }, 
				{ '7', '1', '3', '9', '2', '4', '8', '5', '6' },
				{ '9', '6', '1', '5', '3', '7', '2', '8', '4' }, 
				{ '2', '8', '7', '4', '1', '9', '6', '3', '5' }, 
				{ '3', '4', '5', '2', '8', '6', '1', '7', '9' } 
			};
		System.out.println(isValidSudoku(board));
	}

	private static boolean isValidSudoku(char[][] board) {
		int[][] numberPresentRow = new int[9][9];
		int[][] numberPresentColumn = new int[9][9];
		int[][] numberPresentBox = new int[9][9];

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] != '.') {
					int num = board[i][j] - '0' - 1;
					int indexBox = ((i / 3) * 3) + (j / 3);

					if (numberPresentRow[i][num] != 0 || numberPresentColumn[j][num] != 0 || numberPresentBox[indexBox][num] != 0) {
						return false;
					}
					
					numberPresentRow[i][num] = numberPresentColumn[j][num] = numberPresentBox[indexBox][num] = 1;
				}
			}
		}
		return true;
	}

}