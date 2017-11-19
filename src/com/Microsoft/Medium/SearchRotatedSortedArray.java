package com.Microsoft.Medium;

public class SearchRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = { 5,1,3 };
		int targetValue = 0;
		System.out.println(search(inputArray, targetValue));
	}

	private static int search(int[] nums, int target) {
		int leftPointer = 0;
		int rightPointer = nums.length - 1;
		while (leftPointer <= rightPointer) {
			int midPointer = leftPointer + (rightPointer - leftPointer) / 2;
			if (nums[midPointer] == target)
				return midPointer;

			if ((nums[leftPointer] <= target && target < nums[midPointer]) || (nums[midPointer] < nums[rightPointer] && (target > nums[rightPointer] || target < nums[midPointer]))) {
				rightPointer = midPointer - 1;
			} else {
				leftPointer = midPointer + 1;
			}
		}
		return -1;
	}

}
