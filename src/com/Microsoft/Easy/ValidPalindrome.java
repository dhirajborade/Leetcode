package com.Microsoft.Easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stringOne = "A man, a plan, a canal: Panama";
		String stringTwo = "race a car";
		System.out.println(isPalindrome(stringOne));
		System.out.println(isPalindrome(stringTwo));
	}

	private static boolean isPalindrome(String s) {
		if (s.length() == 0) {
			return true;
		}

		int start = 0;
		int end = s.length() - 1;

		while (start <= end) {
			if (!Character.isLetterOrDigit(s.charAt(start))) {
				start++;
			} else if (!Character.isLetterOrDigit(s.charAt(end))) {
				end--;
			} else {
				if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
					return false;
				}
				start++;
				end--;
			}

		}
		return true;
	}

}
