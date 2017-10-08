package com.Microsoft.Easy;

public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 38;
		System.out.println(addDigits(number));
	}

	private static int addDigits(int num) {
		return 1 + (num - 1) % 9;
	}

}
