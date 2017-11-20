package com.Amazon.Easy;

import java.util.Arrays;

public class ImageSmoother {

	private static int[][] imageSmoother(int[][] M) {
		if (M == null) {
			return null;
		}
		int rows = M.length;
		int cols = rows == 0 ? 0 : M[0].length;
		int[][] resultArray = new int[rows][cols];

		int[] directionRow = new int[] { -1, 0, 1 };
		int[] directionCol = new int[] { -1, 0, 1 };

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				int sumCells = 0;
				int countCells = 0;
				for (int rowInc : directionRow) {
					for (int colInc : directionCol) {
						if (i + rowInc >= 0 && i + rowInc < rows && j + colInc >= 0 && j + colInc < cols) {
							countCells++;
							sumCells += M[i + rowInc][j + colInc];
						}
					}
				}
				resultArray[i][j] = sumCells / countCells;
			}
		}
		return resultArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] M = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		System.out.println(Arrays.deepToString(imageSmoother(M)));
	}

}
