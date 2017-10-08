package com.Microsoft.Easy;

import java.util.Arrays;

public class RotateArray {

	private static int[] inputArray = { 1, 2, 3, 4, 5, 6, 7 };

	public static void main(String[] args) {
		int k = 3;
		rotate(inputArray, k);
		System.out.println(Arrays.toString(inputArray));
	}

	private static void rotate(int[] nums, int k) {
		k %= nums.length;
		reverseArray(nums, 0, nums.length - 1);
		reverseArray(nums, 0, k - 1);
		reverseArray(nums, k, nums.length - 1);

		// k = k % nums.length;
		// int count = 0;
		// for (int start = 0; count < nums.length; start++) {
		// int current = start;
		// int prev = nums[start];
		// do {
		// int next = (current + k) % nums.length;
		// int temp = nums[next];
		// nums[next] = prev;
		// prev = temp;
		// current = next;
		// count++;
		// } while (start != current);
		// }
	}

	private static void reverseArray(int[] nums, int start, int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start++] = nums[end];
			nums[end--] = temp;
		}
	}

}
