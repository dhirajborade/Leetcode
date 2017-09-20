package com.problem.easy;

public class RemoveElement {

	public static void main(String[] args) {
		int[] myArray = new int[] { 1, 1, 1, 1, 2, 2, 3, 3, 3, 5, 5, 6, 7, 7, 8 };
		System.out.println(myArray.length);
		System.out.println(removeElement(myArray, 3));
	}

	private static int removeElement(int[] myArray, int value) {
		int indexI = 0;
		int indexJ = 0;
		while (indexJ < myArray.length) {
			if (myArray[indexJ] != value) {
				myArray[indexI++] = myArray[indexJ];
			}
			indexJ++;
			// if (myArray[indexJ] == value) {
			// indexJ++;
			// } else {
			// myArray[indexI++] = myArray[indexJ];
			// indexJ++;
			// }
		}
		return indexI;

		// int indexI = 0;
		// int n = myArray.length;
		//
		// while (indexI < n) {
		// if (myArray[indexI] == value) {
		// myArray[indexI] = myArray[n - 1];
		// n--;
		// } else {
		// indexI++;
		// }
		// }
		//
		// return n;
	}

}
