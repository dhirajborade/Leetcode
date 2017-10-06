package com.Microsoft.Easy;

public class ExcelColumnToNumber {

	public static void main(String[] args) {
		String inputString = "AD";
		int result = titleToNumber(inputString);
		System.out.println(inputString + " => " + result);
	}

	private static int titleToNumber(String s) {
		int result = 0;
		
		for (int i = 0; i < s.length(); i++) {
			result = result * 26 + (s.charAt(i) - 'A' + 1);
		}
		
		return result;
	}

}
