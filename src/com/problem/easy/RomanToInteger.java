package com.problem.easy;

import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		System.out.println(romanToInteger(inputString));
		sc.close();
	}

	private static int romanToInteger(String inputString) {
		char[] numerals = new char[] { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int[] values = new int[] { 1, 5, 10, 50, 100, 500, 1000 };
		HashMap<Character, Integer> myMap = new HashMap<>();
		for (int i = 0; i < numerals.length; i++) {
			myMap.put(numerals[i], values[i]);
		}
		int result = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (i == inputString.length() - 1) {
				result += myMap.get(inputString.charAt(i));
			} else {
				int currentCharValue = myMap.get(inputString.charAt(i));
				int nextCharValue = myMap.get(inputString.charAt(i + 1));
				if (nextCharValue > currentCharValue) {
					result += (nextCharValue - currentCharValue);
					i++;
				} else {
					result += currentCharValue;
				}
			}
		}
		return result;
	}

}
