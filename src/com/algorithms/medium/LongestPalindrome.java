package com.algorithms.medium;

public class LongestPalindrome {

	private static int lo;
	private static int maxLen;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "babad";
		String output = longestPalindrome(str);
		System.out.println(output);
	}

	public static String longestPalindrome(String s) {
		int len = s.length();
		if (len < 2)
			return s;

		for (int i = 0; i < len - 1; i++) {
			extendPalindrome(s, i, i); // assume odd length, try to extend Palindrome as possible
			extendPalindrome(s, i, i + 1); // assume even length.
		}
		return s.substring(lo, lo + maxLen);
	}

	private static void extendPalindrome(String s, int j, int k) {
		while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
			j--;
			k++;
		}
		if (maxLen < k - j - 1) {
			lo = j + 1;
			maxLen = k - j - 1;
		}
	}

	/*
	 * private static boolean isPalindrome(String str) { for (int i = 0, j =
	 * str.length() - 1; i < str.length() / 2; i++, j--) { if (str.charAt(i) !=
	 * str.charAt(j)) { return false; } }
	 * 
	 * return true; }
	 */

}
