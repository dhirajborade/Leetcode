package com.problem.hard;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] myArray1 = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int[] myArray2 = new int[] { 1, 2, 3 };
		double median = solution(myArray1, myArray2);
		System.out.println(median);
	}

	public static double solution(int[] myArray1, int[] myArray2) {
		int startIndexA = 0;
		int endIndexA = myArray1.length - 1;
		int startIndexB = 0;
		int endIndexB = myArray2.length - 1;
		if (myArray1.length > myArray2.length) {
			return medianOfTwoSortedArrays(myArray2, myArray1, startIndexB, endIndexB, startIndexA, endIndexA);
		}
		return medianOfTwoSortedArrays(myArray1, myArray2, startIndexA, endIndexA, startIndexB, endIndexB);
	}

	private static double medianOfTwoSortedArrays(int[] myArray1, int[] myArray2, int startIndexA, int endIndexA,
			int startIndexB, int endIndexB) {
		
		if (myArray1.length == 0) {
			return findMedian(myArray2, startIndexB, endIndexB);
		}
		
		if (endIndexA - startIndexA == 0 && endIndexB - startIndexB == 0) {
			return (myArray1[startIndexA] + myArray2[startIndexB]) / 2.0;
		}

		if (endIndexA - startIndexA == 1 && endIndexB - startIndexB == 1) {
			return (Math.max(myArray1[startIndexA], myArray2[startIndexB])
					+ Math.min(myArray1[endIndexA], myArray2[endIndexB])) / 2.0;
		}

		double medianArray1 = findMedian(myArray1, startIndexA, endIndexA);
		double medianArray2 = findMedian(myArray2, startIndexB, endIndexB);

		if (medianArray1 == medianArray2) {
			return medianArray1;
		}

		if (myArray1.length == myArray2.length) {
			if (medianArray1 < medianArray2) {
				if ((endIndexA - startIndexA) % 2 == 0) {
					startIndexA = startIndexA + (endIndexA - startIndexA) / 2;
					endIndexB = startIndexB + (endIndexB - startIndexB) / 2;
				} else {
					startIndexA = startIndexA + (endIndexA - startIndexA) / 2;
					endIndexB = startIndexB + ((endIndexB - startIndexB) / 2) + 1;
				}

			}

			if (medianArray1 > medianArray2) {
				if ((endIndexB - startIndexB) % 2 == 0) {
					startIndexB = startIndexB + (endIndexB - startIndexB) / 2;
					endIndexA = startIndexA + (endIndexA - startIndexA) / 2;
				} else {
					startIndexB = startIndexB + (endIndexB - startIndexB) / 2;
					endIndexA = (startIndexA + (endIndexA - startIndexA) / 2) + 1;
				}
			}
		} else {
			if (medianArray1 < medianArray2) {
				startIndexA = startIndexA + (endIndexA - startIndexA) / 2;
				endIndexB = endIndexB - (endIndexA - startIndexA) / 2;
			}

			if (medianArray1 > medianArray2) {
				if ((endIndexA - startIndexA) % 2 == 0) {
					endIndexA = endIndexA - (endIndexA - startIndexA) / 2;
					startIndexB = startIndexB + (endIndexA - startIndexA) / 2;
				} else {
					endIndexA = (startIndexA + (endIndexA - startIndexA) / 2) + 1;
					startIndexB = (startIndexB + (endIndexA - startIndexA) / 2) + 1;
				}
			}
		}

		return medianOfTwoSortedArrays(myArray1, myArray2, startIndexA, endIndexA, startIndexB, endIndexB);
	}

	public static double findMedian(int[] myArray, int startIndex, int endIndex) {
		int indexDiff = (endIndex - startIndex);
		if (indexDiff % 2 == 0) {
			return myArray[startIndex + (indexDiff / 2)];
		} else {
			return (myArray[startIndex + (indexDiff / 2)] + myArray[startIndex + (indexDiff / 2) + 1]) / 2.0;
		}
	}

	public static double findMedianOfTwo(int a, int b) {
		return (a + b) / 2.0;
	}

	public static double findMedianOfThree(int a, int b, int c) {
		return a + b + c - Math.max(a, Math.max(b, c)) - Math.min(a, Math.min(b, c));
	}

	public static double findMedianOfFour(int a, int b, int c, int d) {
		int maxNumber = Math.max(a, Math.max(b, Math.max(c, d)));
		int minNumber = Math.min(a, Math.min(b, Math.min(c, d)));
		return (a + b + c + d - maxNumber - minNumber) / 2.0;
	}
}
