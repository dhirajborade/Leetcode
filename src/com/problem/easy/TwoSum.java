package com.problem.easy;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 18;
		int[] result = new int[2];
		result = twoSum(nums, target);
		for (int i = 0 ; i < result.length ; i++) {
			System.out.print(result[i] + "\t");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (hMap.containsKey(target - nums[i])) {
				result[0] = hMap.get(target - nums[i]);
				result[1] = i;
			}
			hMap.put(nums[i], i);
		}
		return result;
	}

}
