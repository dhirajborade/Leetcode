package com.Amazon.Easy;

import java.util.Arrays;

public class TwoSumII {

	private static int[] twoSum(int[] numbers, int target) {
		int left = 0;
		int right = numbers.length - 1;

		while (left < right) {
			int sum = numbers[left] + numbers[right];
			if (target == sum) {
				return new int[] { left + 1, right + 1 };
			} else if (sum < target) {
				left++;
			} else {
				right--;
			}
		}

		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = new int[] { 2, 7, 11, 15 };
		int target = 9;
		System.out.println(Arrays.toString(twoSum(numbers, target)));
	}

}
