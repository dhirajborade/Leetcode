package com.Microsoft.Medium;

public class ReverseWordsII {

	public static void main(String[] args) {
		String inputString = "the sky is blue";
		char[] inputCharArray = inputString.toCharArray();
		System.out.println(reverseWords(inputCharArray));
	}

	private static char[] reverseWords(char[] s) {
		reverseTemp(s, 0, s.length - 1);
		
		int right = 0;
		
		while (right < s.length) {
			int left = right;
			while (right < s.length && s[right] != ' ') {
				right++;
			}
			reverseTemp(s, left, right - 1);
			right++;
		}
		return s;
	}

	private static void reverseTemp(char[] s, int start, int end) {
		while (start < end) {
			char temp = s[start];
			s[start++] = s[end];
			s[end--] = temp;
		}
	}

}
