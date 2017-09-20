package com.problem.easy;

public class LengthOfLastWord {

	public static void main(String[] args) {
		String myStr = "a ";
		System.out.println(lengthOfLastWord(myStr));
	}

	public static int lengthOfLastWord(String s) {
//		s = s.trim();
////		int indexI = 0, indexJ = 0;
////		while(indexI < s.length()) {
////			if (s.charAt(indexI) == ' ' && indexI != s.length() - 1) {
////				indexJ = indexI + 1;
////			}
////			indexI++;
////		}
////		return indexI - indexJ;
//		
//		int lastIndex = s.lastIndexOf(" ") + 1;
//		return s.length() - lastIndex;
		
		return s.trim().length() - s.trim().lastIndexOf(" ") - 1;
	}

}
