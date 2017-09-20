package com.problem.easy;

import java.util.Scanner;

public class IntegerToRoman {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inputValue = sc.nextInt();
		System.out.println(integerToRoman(inputValue));
		sc.close();
	}

	private static String integerToRoman(int inputValue) {
		String[] numerals = new String[] { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		int[] values = new int[] { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		StringBuilder sb = new StringBuilder();
		int index = 0;
		while (inputValue > 0) {
			if (inputValue - values[index] >= 0) {
				sb.append(numerals[index]);
				inputValue -= values[index];
			} else {
				index++;
			}
		}
		return sb.toString();
	}

}
