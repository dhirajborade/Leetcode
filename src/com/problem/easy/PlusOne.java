package com.problem.easy;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = new int[] { 9, 9, 9, 9, 9 };
		int[] result = plusOne(digits);
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + "\t");
		}
	}

	public static int[] plusOne(int[] digits) {
		int length = digits.length;
		int carry = 1;
		while (length > 0) {
			int temp = digits[length - 1] + carry;
			carry = 0;
			if (temp > 9) {
				digits[length - 1] = temp % 10;
				carry = temp / 10;
			} else {
				digits[length - 1] = temp;
			}
			length--;
		}
		if (carry > 0) {
			int[] result = new int[digits.length + 1];
			result[0] = carry;
			for (int i = 1; i < result.length; i++) {
				result[i] = digits[i - 1];
			}
			return result;
		}
		return digits;
	}

}
