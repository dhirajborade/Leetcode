package com.Microsoft.Medium;

public class NumberOfIslands {

	public static void main(String[] args) {
		char[][] inputArray = { 
				{ '1', '1', '1', '1', '0' }, 
				{ '1', '1', '0', '1', '0' }, 
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '1' } 
				};
		int result = numberOfIslands(inputArray);
		System.out.println(result);
	}

	private static int numberOfIslands(char[][] grid) {
		int numberOfIslands = 0;
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				numberOfIslands += DFSExplore(grid, i, j);
			}
		}
		return numberOfIslands;
	}

	private static int DFSExplore(char[][] grid, int i, int j) {
		if (i < 0 || j < 0 || i == grid.length || j == grid[i].length || grid[i][j] == '0') {
			return 0;
		}
		grid[i][j] = '0';
		DFSExplore(grid, i - 1, j);
		DFSExplore(grid, i + 1, j);
		DFSExplore(grid, i, j - 1);
		DFSExplore(grid, i, j + 1);
		return 1;
	}

}
