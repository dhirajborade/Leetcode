package com.problem.easy;

public class ReverseInteger {

	public static void main(String[] args) {
		int x = 1;
		int result = reverseInteger(x);
		System.out.println(result);
	}

	private static int reverseInteger(int x) {
		int result = 0;
		while (x != 0) {
			int newResult = result * 10 + x % 10;
			if ((newResult - (x % 10)) / 10 != result) {
				return 0;
			}
			result = newResult;
			x /= 10;
		}
		return result;
	}

}