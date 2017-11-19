package com.Microsoft.Medium;

public class MinimumRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(findMin(inputArray));
	}

	private static int findMin(int[] nums) {
		int leftPointer = 0;
		int rightPointer = nums.length - 1;

		while (leftPointer < rightPointer) {
			if (nums[leftPointer] < nums[rightPointer]) {
				return nums[leftPointer];
			}
			int midPointer = leftPointer + (rightPointer - leftPointer) / 2;
			if (nums[midPointer] >= nums[leftPointer]) {
				leftPointer = midPointer + 1;
			} else {
				rightPointer = midPointer;
			}
		}

		return nums[leftPointer];
	}

}
