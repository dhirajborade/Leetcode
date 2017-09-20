package com.problem.hard;

public class MedianSortedArrays {

	public static void main(String[] args) {
		int[] myArray2 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int[] myArray1 = new int[] { 1, 2, 3 };
		double median = medianOfSortedArrays(myArray1, myArray2);
		System.out.println(median);
	}

	private static double medianOfSortedArrays(int[] myArray1, int[] myArray2) {
		if (myArray1.length < myArray2.length) {
			return medianOfSortedArrays(myArray2, myArray1);
		}
		
		int low = 0;
		int high = myArray2.length * 2;
		
		while (low <= high) {
			int mid2 = (low + high) / 2;
			int mid1 = myArray1.length + myArray2.length - mid2;
			
			double l1 = (mid1 == 0) ? Integer.MIN_VALUE : myArray1[(mid1 - 1) / 2];
			double l2 = (mid2 == 0) ? Integer.MIN_VALUE : myArray2[(mid2 - 1) / 2];
			double r1 = (mid1 == (myArray1.length * 2)) ? Integer.MAX_VALUE : myArray1[mid1 / 2];
			double r2 = (mid2 == (myArray2.length * 2)) ? Integer.MAX_VALUE : myArray2[mid2 / 2];
			
			if (l1 > r2) {
				low = mid2 + 1;
			} else if (l2 > r1) {
				high = mid2 - 1;
			} else {
				return (Math.max(l1, l2) + Math.min(r1, r2)) / 2;
			}
		}
		return -1;
	}

}
