package com.Microsoft.Medium;

public class ReverseWords {

	public static void main(String[] args) {
		String inputString = "the sky is blue";
		char[] inputCharArray = inputString.toCharArray();
		reverseWords(inputCharArray);
	}

	private static void reverseWords(char[] s) {
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
		System.out.println(s);
	}

	private static void reverseTemp(char[] s, int start, int end) {
		while (start < end) {
			char temp = s[start];
			s[start++] = s[end];
			s[end--] = temp;
		}
	}

}
