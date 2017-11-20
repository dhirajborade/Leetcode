package com.Amazon.Easy;

public class ThirdMaximumNumber {

	private static int thirdMax(int[] nums) {
		Integer maxOne = null;
		Integer maxTwo = null;
		Integer maxThree = null;
		
		for (Integer n : nums) {
			if (n.equals(maxOne) || n.equals(maxTwo) || n .equals(maxThree)) {
				continue;
			}
			if (maxOne == null || n > maxOne) {
				maxThree = maxTwo;
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo == null || n > maxTwo) {
				maxThree = maxTwo;
				maxTwo = n;
			} else if (maxThree == null || n > maxThree) {
				maxThree = n;
			}
		}
		return maxThree == null ? maxOne : maxThree;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayOne = new int[] { 3, 2, 1 };
		int[] arrayTwo = new int[] { 2, 1 };
		int[] arrayThree = new int[] { 3, 2, 2, 1 };
		int[] arrayFour = new int[] { 1, 3, 2, 4, 4, 5, 10, 6 };
		System.out.println(thirdMax(arrayOne));
		System.out.println(thirdMax(arrayTwo));
		System.out.println(thirdMax(arrayThree));
		System.out.println(thirdMax(arrayFour));
	}

}
