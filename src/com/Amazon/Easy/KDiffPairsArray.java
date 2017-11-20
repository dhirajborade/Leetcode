package com.Amazon.Easy;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsArray {

	private static int findPairs(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k < 0) {
            return 0;
        }
		int pairCount = 0;
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		
		for (int num : nums) {
			hMap.put(num, hMap.getOrDefault(num, 0) + 1);
		}
		
		for (Map.Entry<Integer, Integer> mapEntry : hMap.entrySet()) {
			if (k == 0) {
				if (mapEntry.getValue() >= 2) {
					pairCount++;
				}
			} else {
				if (hMap.containsKey(mapEntry.getKey() + k)) {
					pairCount++;
				}
			}
		}
		
		return pairCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findPairs(new int[] { 3, 1, 4, 1, 5 }, 2));
		System.out.println(findPairs(new int[] { 1, 2, 3, 4, 5 }, 1));
		System.out.println(findPairs(new int[] { 1, 3, 1, 5, 4 }, 0));
	}

}
