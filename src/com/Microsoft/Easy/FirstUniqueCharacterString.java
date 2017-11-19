package com.Microsoft.Easy;

public class FirstUniqueCharacterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr = "loveleetcode";
		System.out.println(firstUniqChar(inputStr));
	}

	private static int firstUniqChar(String s) {
		int[] characterFreqArray = new int[256];

		for (int i = 0; i < s.length(); i++) {
			characterFreqArray[s.charAt(i) - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (characterFreqArray[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		return -1;
	}

}
