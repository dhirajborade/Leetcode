package com.problem.medium;
import java.util.HashMap;

public class LengthOfLongestSubstring {

	public static void main(String[] args) {
		String inputStr0 = "abcadabb";
		String inputStr1 = "bbbbb";
		String inputStr2 = "pwwkew";
		System.out.println(lengthOfLongestSubstring(inputStr0));
		System.out.println(lengthOfLongestSubstring(inputStr1));
		System.out.println(lengthOfLongestSubstring(inputStr2));
	}

	public static int lengthOfLongestSubstring(String s) {
		HashMap<Character, Integer> hMap = new HashMap<Character, Integer>();
		int outputCount = 0;
		int leftPointer = 0;
		for (int rightPointer = 0; rightPointer < s.length(); rightPointer++) {
			if (hMap.containsKey(s.charAt(rightPointer))) {
				leftPointer = Math.max(leftPointer, hMap.get(s.charAt(rightPointer)) + 1);
			}
			hMap.put(s.charAt(rightPointer), rightPointer);
			outputCount = Math.max(outputCount, rightPointer - leftPointer + 1);
		}
		return outputCount;
	}
}
