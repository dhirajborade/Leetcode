package com.Amazon.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "baa";
		String p = "aa";
		System.out.println(findAnagrams(s, p).toString());
	}

	private static List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<Integer>();
		if (p.length() > s.length()) {
			return result;
		}
		HashMap<Character, Integer> freqMap = new HashMap<Character, Integer>();
		for (char ch : p.toCharArray()) {
			int tempFreq = 1;
			if (freqMap.containsKey(ch)) {
				tempFreq = freqMap.get(ch) + 1;
			}
			freqMap.put(ch, tempFreq);
		}
		int counter = freqMap.size();
		int startIndex = 0;
		int endIndex = 0;

		while (endIndex < s.length()) {
			char chA = s.charAt(endIndex);
			if (freqMap.containsKey(chA)) {
				freqMap.put(chA, freqMap.get(chA) - 1);
				if (freqMap.get(chA) == 0) {
					counter--;
				}
			}
			endIndex++;
			while (counter == 0) {
				char chB = s.charAt(startIndex);
				if (freqMap.containsKey(chB)) {
					freqMap.put(chB, freqMap.get(chB) + 1);
					if (freqMap.get(chB) > 0) {
						counter++;
					}
				}
				if (endIndex - startIndex == p.length()) {
					result.add(startIndex);
				}
				startIndex++;
			}
		}
		return result;
	}

}
