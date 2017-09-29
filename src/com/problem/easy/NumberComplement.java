package com.problem.easy;

public class NumberComplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(5)); // 101
	}

	public static int findComplement(int num) {
		int mask = ((Integer.highestOneBit(num) << 1) - 1);
		num = ~num;
		return num & mask;
	}
}
