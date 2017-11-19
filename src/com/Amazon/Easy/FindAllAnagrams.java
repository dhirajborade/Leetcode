package com.Amazon.Easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cbaebabacd";
		String p = "abc";
		System.out.println(findAnagrams(s, p).toString());
	}

	private static List<Integer> findAnagrams(String s, String p) {
		List<Integer> resultList = new ArrayList<>();
		int[] freqArray = new int[256];

		for (char ch : p.toCharArray()) {
			freqArray[ch]++;
		}

		int left = 0, right = 0, count = p.length();

		while (right < s.length()) {
			if (freqArray[s.charAt(right++)]-- >= 1) {
				count--;
			}
			if (count == 0) {
				resultList.add(left);
			}
			if (right - left == p.length() && freqArray[s.charAt(left++)]++ >= 0) {
				count++;
			}
		}
		return resultList;
	}

}
