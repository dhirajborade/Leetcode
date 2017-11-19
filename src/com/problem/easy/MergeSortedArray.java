package com.problem.easy;

public class MergeSortedArray {

	public static void main(String[] args) {
		int m = 5;
		int n = 3;
		int[] nums1 = new int[m + n];
		int[] nums2 = new int[n];

		nums1[0] = 1;
		nums1[1] = 2;
		nums1[2] = 3;
		nums1[3] = 10;
		nums1[4] = 98;
		nums1[5] = 0;
		nums1[6] = 0;
		nums1[7] = 0;

		nums2[0] = 4;
		nums2[1] = 5;
		nums2[2] = 99;

		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + "\t");
		}
		System.out.println();
		for (int i = 0; i < nums2.length; i++) {
			System.out.print(nums2[i] + "\t");
		}
		System.out.println();
		merge(nums1, m, nums2, n);
	}

	private static void merge(int[] nums1, int m, int[] nums2, int n) {
		int arrayOneLength = m - 1;
		int arrayTwoLength = n - 1;
		int resultArrayLength = m + n - 1;

		while (arrayOneLength >= 0 && arrayTwoLength >= 0) {
			if (nums1[arrayOneLength] > nums2[arrayTwoLength]) {
				nums1[resultArrayLength--] = nums1[arrayOneLength--];
			} else {
				nums1[resultArrayLength--] = nums2[arrayTwoLength--];
			}
		}

		while (arrayTwoLength >= 0) {
			nums1[resultArrayLength--] = nums2[arrayTwoLength--];
		}

		System.out.println();
		for (int i = 0; i < nums1.length; i++) {
			System.out.print(nums1[i] + "\t");
		}
		System.out.println();
	}

}
