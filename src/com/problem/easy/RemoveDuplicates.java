package com.problem.easy;

public class RemoveDuplicates {

	public static void main(String[] args) {
		int[] myArray = new int[] { 1, 1, 1, 1, 2, 2, 3, 3, 3, 5, 5, 6, 7, 7, 8 };
		System.out.println(myArray.length);
		System.out.println(removeDuplicates(myArray));
	}

	private static int removeDuplicates(int[] myArray) {
		if (myArray.length == 0) {
			return 0;
		}

		int indexI = 0;
		int indexJ = 1;

		while (indexJ < myArray.length) {
			if (myArray[indexJ] > myArray[indexI]) {
				myArray[++indexI] = myArray[indexJ];
			}
			indexJ++;
		}

		return indexI + 1;
	}

}
