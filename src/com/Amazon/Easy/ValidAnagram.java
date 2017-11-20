package com.Amazon.Easy;

public class ValidAnagram {

	private static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] countFreq = new int[26];
		for (int i = 0; i < s.length(); i++) {
			countFreq[s.charAt(i) - 'a']++;
			countFreq[t.charAt(i) - 'a']--;
		}
		for (int count : countFreq) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sourceOne = "anagram";
		String targetOne = "nagaram";
		String sourceTwo = "rat";
		String targetTwo = "car";
		System.out.println(isAnagram(sourceOne, targetOne));
		System.out.println(isAnagram(sourceTwo, targetTwo));
	}

}
