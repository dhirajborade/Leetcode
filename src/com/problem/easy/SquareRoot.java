package com.problem.easy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SquareRoot {

	public static void main(String[] args) {
		assertThat(mySqrt(0), is(0));
		System.out.println("All Test Cases passed");
	}

	private static int mySqrt(int x) {
		int leftPointer = 1;
		int rightPointer = x;
		int result = 0;
		
		while (leftPointer <= rightPointer) {
			int midPoint = leftPointer + (rightPointer - leftPointer) / 2;
			if (midPoint <= x / midPoint) {
				leftPointer = midPoint + 1;
				result = midPoint;
			} else {
				rightPointer = midPoint - 1;
			}
		}
		
		return result;
	}

}
