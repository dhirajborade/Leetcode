package com.Microsoft.Medium;

import java.util.Arrays;

public class SortColors {

	private static int[] inputArray = new int[] { 1, 2, 1, 2, 1, 0, 2, 1, 0, 2, 2, 0, 1, 1, 1, 0, 2, 2, 0, 1 };

	public static void main(String[] args) {
		System.out.println(Arrays.toString(inputArray));
		sortColors(inputArray);
		System.out.println(Arrays.toString(inputArray));
	}

	private static void sortColors(int[] nums) {
		int indexI = 0;
		int indexJ = nums.length - 1;

		for (int i = 0; i < nums.length; i++) {
			while (nums[i] == 2 && i < indexJ)
				swapNumbers(nums, i, indexJ--);
			while (nums[i] == 0 && i > indexI)
				swapNumbers(nums, i, indexI++);
		}
	}

	private static void swapNumbers(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
