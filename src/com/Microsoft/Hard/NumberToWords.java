package com.Microsoft.Hard;

public class NumberToWords {

	private static String[] LESSTHAN20 = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
			"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen",
			"Nineteen" };
	private static String[] TENS = { "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
			"Ninety" };
	private static String[] THOUSANDS = { "", "Thousand", "Million", "Billion" };

	public static void main(String[] args) {
		int numOne = 123;
		int numTwo = 12345;
		int numThree = 1234567;
		String resultOne = numberToWords(numOne);
		String resultTwo = numberToWords(numTwo);
		String resultThree = numberToWords(numThree);
		System.out.println(resultOne);
		System.out.println(resultTwo);
		System.out.println(resultThree);
	}

	private static String numberToWords(int num) {
		String resultWords = "";

		if (num == 0) {
			return "Zero";
		}

		int i = 0;

		while (num > 0) {
			if (num % 1000 != 0) {
				resultWords = helperFunction(num % 1000) + THOUSANDS[i] + " " + resultWords;
			}
			num /= 1000;
			i++;
		}
		return resultWords;
	}

	private static String helperFunction(int num) {
		if (num == 0) {
			return "";
		} else if (num < 20) {
			return LESSTHAN20[num] + " ";
		} else if (num < 100) {
			return TENS[num / 10] + " " + helperFunction(num % 10);
		} else {
			return LESSTHAN20[num / 100] + " Hundred " + helperFunction(num % 100);
		}
	}

}
