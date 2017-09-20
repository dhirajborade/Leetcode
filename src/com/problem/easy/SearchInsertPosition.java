package com.problem.easy;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] myArray = new int[] { 1, 3, 5, 6 };
		int target = 5;
		System.out.println(searchInsert(myArray, target));
	}

	private static int searchInsert(int[] myArray, int target) {
		// int returnIndex = 0;
		// for (int i = 0; i < myArray.length; i++) {
		// if (myArray[i] == target) {
		// returnIndex = i;
		// }
		// }
		// if (returnIndex == 0) {
		// for (int i = 0; i < myArray.length; i++) {
		// if (myArray[i] < target) {
		// continue;
		// }
		// returnIndex = i;
		// break;
		// }
		// }
		// if (target > myArray[myArray.length - 1]) {
		// returnIndex = myArray.length;
		// }
		// return returnIndex;

		int lowIndex = 0;
		int highIndex = myArray.length - 1;

		while (lowIndex <= highIndex) {
			int midIndex = (lowIndex + highIndex) / 2;
			if (myArray[midIndex] == target) {
				return midIndex;
			} else if (myArray[midIndex] > target) {
				highIndex = midIndex - 1;
			} else {
				lowIndex = midIndex + 1;
			}
		}

		return lowIndex;
	}
}
