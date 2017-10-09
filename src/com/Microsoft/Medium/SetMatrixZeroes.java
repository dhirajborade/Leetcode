package com.Microsoft.Medium;

import java.util.Arrays;

public class SetMatrixZeroes {

	private static int[][] matrix = new int[][] { { 1, 2, 3 }, { 5, 0, 2 }, { 0, 2, 3 }, { 1, 7, 4 } };

	public static void main(String[] args) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println();
		setZeroes(matrix);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println();

	}

	private static void setZeroes(int[][] matrix) {		
		boolean rowZero = false, colZero = false;
		
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				rowZero = true;
			}
		}
		
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				colZero = true;
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][0] == 0 || matrix[0][j] == 0) {
					matrix[i][j] = 0;
				}
			}
		}
		if (rowZero) {
			for (int j = 0; j < matrix[0].length; j++) {
				matrix[0][j] = 0;
			}
		}
		if (colZero) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}
	}

}
