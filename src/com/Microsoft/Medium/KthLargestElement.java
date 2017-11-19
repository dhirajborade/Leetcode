package com.Microsoft.Medium;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 5, 3, 6, 8, 45, 5, 1, 64, 9, 100, 2 };
		int k = (nums.length + 1) / 2;
		System.out.println(findKthLargest(nums, k));
	}

	private static int findKthLargest(int[] nums, int k) {
		k = nums.length - k;
		int left = 0;
		int right = nums.length - 1;
		while (left < right) {
			int elementIndex = selectionPartition(nums, left, right);
			if (elementIndex < k) {
				left = elementIndex + 1;
			} else if (elementIndex > k) {
				right = elementIndex - 1;
			} else {
				break;
			}
		}
		return nums[k];
	}

	private static int selectionPartition(int[] nums, int left, int right) {
		int i = left;
		int j = right + 1;
		while (true) {
			while (i < right && compareElements(nums[++i], nums[left])) {
			}
			while (j > left && compareElements(nums[left], nums[--j])) {
			}
			if (i >= j) {
				break;
			}
			swapElements(nums, i, j);
		}
		swapElements(nums, left, j);
		return j;
	}

	private static boolean compareElements(int left, int right) {
		return left < right;
	}

	private static void swapElements(int[] nums, int left, int right) {
		int temp = nums[left];
		nums[left] = nums[right];
		nums[right] = temp;
	}

}
