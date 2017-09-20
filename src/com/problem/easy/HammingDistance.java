package com.problem.easy;

public class HammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(hammingDistance(1, 4));
	}

	public static int hammingDistance(int x, int y) {
		int xor = x ^ y, count = 0;
		while (xor != 0) {
			xor &= (xor - 1);
			count++;
		}
		return count;
	}
}
