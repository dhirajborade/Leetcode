package com.Microsoft.Easy;

public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		int input = 28;
		String result = convertToTitle(input);
		System.out.println(result);
	}

	private static String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		
		while (n > 0) {
			n--;
			sb.insert(0, (char) ('A' + n % 26));
			n /= 26;
		}
		return sb.toString();
	}
}
