package com.Microsoft.Easy;

public class MissingNumber {

	public static void main(String[] args) {
		int[] numberArray = { 0, 1, 3, 4 };
		int result = missingNumber(numberArray);
		System.out.println(result);
	}

	private static int missingNumber(int[] nums) {
		int xor = 0;
		int i = 0;

		while (i < nums.length) {
			xor = xor ^ i ^ nums[i];
			i++;
		}

		return xor ^ i;
	}

}
