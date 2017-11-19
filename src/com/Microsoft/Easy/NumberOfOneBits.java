package com.Microsoft.Easy;

public class NumberOfOneBits {

	public static void main(String[] args) {
		int number = 11;
		int result = hammingWeight(number);
		System.out.println(result);
	}

	private static int hammingWeight(int n) {
		// int numberOfBits = 0;
		// int mask = 1;
		// for (int i = 0; i < 32; i++) {
		// if ((n & mask) != 0) {
		// numberOfBits++;
		// }
		// mask <<= 1;
		// }
		// return numberOfBits;

		int numberOfBits = 0;

		while (n != 0) {
			numberOfBits++;
			n &= (n - 1);
		}
		return numberOfBits;
	}

}
