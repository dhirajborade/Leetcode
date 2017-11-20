package com.Amazon.Easy;

public class RepeatedSubstringPattern {

	private static boolean repeatedSubstringPattern(String s) {
		int stringLength = s.length();
		for (int i = stringLength / 2; i >= 1; i--) {
			if (stringLength % i == 0) {
				int repeatTimes = stringLength / i;
				String subString = s.substring(0, i);
				StringBuilder sb = new StringBuilder();
				for (int j = 0; j < repeatTimes; j++) {
					sb.append(subString);
				}
				if (sb.toString().equals(s)) {
					return true;
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedSubstringPattern("abab"));
		System.out.println(repeatedSubstringPattern("aba"));
		System.out.println(repeatedSubstringPattern("abcabcabcabc"));
	}

}
