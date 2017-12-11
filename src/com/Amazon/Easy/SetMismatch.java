/**
 *
 */
package com.Amazon.Easy;

import java.util.Arrays;

/**
 * @author dhirajborade
 *
 */
public class SetMismatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(findErrorNums(new int[] { 1, 2, 4, 4 })));
	}

	private static int[] findErrorNums(int[] nums) {
		int[] result = new int[] { -1, -1 };
		for (int num : nums) {
			if (nums[Math.abs(num) - 1] < 0) {
				result[0] = Math.abs(num);
			} else {
				nums[Math.abs(num) - 1] *= -1;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				result[1] = i + 1;
			}
		}
		return result;
	}

}
