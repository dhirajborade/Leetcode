package com.Microsoft.Medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
//		int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
		int[][] matrix = {{3}, {2}};
		List<Integer> resultList = spiralOrder(matrix);
		System.out.println(resultList.toString());
	}

	private static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> resultList = new ArrayList<Integer>();
		if (matrix.length == 0) {
			return resultList;
		}
		
		int rowStart = 0;
		int rowEnd = matrix.length - 1;
		int colStart = 0;
		int colEnd = matrix[0].length - 1;
		
		while (rowStart <= rowEnd && colStart <= colEnd) {
			for (int i = colStart; i <= colEnd; i++) { resultList.add(matrix[rowStart][i]); }
			for (int i = rowStart + 1; i <= rowEnd; i++) { resultList.add(matrix[i][colEnd]); }
			if (rowStart < rowEnd && colStart < colEnd) {
				for (int i = colEnd - 1; i > colStart; i--) { resultList.add(matrix[rowEnd][i]); }
				for (int i = rowEnd; i > rowStart; i--) { resultList.add(matrix[i][colStart]); }
			}
			rowStart++;
			rowEnd--;
			colStart++;
			colEnd--;
			
		}
		return resultList;
	}

}
