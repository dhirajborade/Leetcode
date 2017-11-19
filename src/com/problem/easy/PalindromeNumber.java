package com.problem.easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		int x = 123321;
		boolean result = isPalindrome(x);
		System.out.println(result);
	}
	
	public static boolean isPalindrome(int x) {
		int divisor = 1;
		while (x / divisor >= 10) {
			divisor *= 10;
		}
		while (x != 0) {
			int leftSide = x / divisor;
			int rightSide = x % 10;
			if (leftSide != rightSide) {
				return false;
			}
			x = (x % divisor) / 10;
			divisor /= 100;
		}
		return true;
	}

}
