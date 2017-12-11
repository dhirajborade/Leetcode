package com.problem.medium;

public class LongestPalindromeSubstring {

	private static int lo;
	private static int maxLen;

	public static void main(String[] args) {
		String inputStr0 = "abcadabb";
		String inputStr1 = "bbbbb";
		String inputStr2 = "pwwkew";
		System.out.println(longestPalindromeSubstring(inputStr0));
		System.out.println(longestPalindromeSubstringDynamicProg(inputStr0));
		System.out.println(longestPalindromeSubstring(inputStr1));
		System.out.println(longestPalindromeSubstringDynamicProg(inputStr1));
		System.out.println(longestPalindromeSubstring(inputStr2));
		System.out.println(longestPalindromeSubstringDynamicProg(inputStr2));
	}

	private static String longestPalindromeSubstring(String s) {
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

	private static String longestPalindromeSubstringDynamicProg(String s) {
		int lengthOfString = s.length();
		int startIndex = 0;
		int endIndex = 1;
		boolean[][] palindromeDP = new boolean[lengthOfString][lengthOfString];

		for (int i = 0; i < lengthOfString; i++) {
			if (s.charAt(i) == s.charAt(i)) {
				palindromeDP[i][i] = true;
			}
		}

		for (int i = 0; i < lengthOfString - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				palindromeDP[i][i + 1] = true;
				startIndex = i;
				endIndex = 2;
			}
		}

		for (int currentLength = 3; currentLength <= lengthOfString; currentLength++) {
			for (int i = 0; i < lengthOfString - currentLength + 1; i++) {
				int j = i + currentLength - 1;
				if (s.charAt(i) == s.charAt(j) && palindromeDP[i + 1][j - 1]) {
					palindromeDP[i][j] = true;
					startIndex = i;
					endIndex = currentLength;
				}
			}
		}

		return s.substring(startIndex, endIndex + startIndex);
	}

}
