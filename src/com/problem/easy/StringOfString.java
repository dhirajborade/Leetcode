package com.problem.easy;

public class StringOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String haystack = "dhiraj";
		String needle = "raj";
		System.out.println(strStr(haystack, needle));
	}

	public static int strStr(String haystack, String needle) {
//		for (int i = 0;; i++) {
//			for (int j = 0;; j++) {
//				if (j == needle.length()) {
//					return i;
//				}
//				if (i + j == haystack.length()) {
//					return -1;
//				}
//				if (needle.charAt(j) != haystack.charAt(i + j)) {
//					break;
//				}
//			}
//		}
		if (haystack.length() < needle.length()) {
			return -1;
		}
		if (needle.length() == 0) {
			return 0;
		}
		
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if (haystack.substring(i, i + needle.length()).equals(needle)) {
				return i;
			}
		}
		return -1;
	}

}
