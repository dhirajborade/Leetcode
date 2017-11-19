package com.Microsoft.Medium;

import java.util.Arrays;

public class ProductOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] inputArray = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(productExceptSelf(inputArray)));
	}

	private static int[] productExceptSelf(int[] nums) {
		int[] resultArray = new int[nums.length];
		int tempVariable = 1;
		
		for (int i = 0; i < resultArray.length; i++) {
			resultArray[i] = 1;
		}
		for (int i = 0; i < nums.length; i++) {
			resultArray[i] = tempVariable;
			tempVariable = tempVariable * nums[i];
		}
		tempVariable = 1;
		for (int i = nums.length - 1; i >=0; i--) {
			resultArray[i] = resultArray[i] * tempVariable;
			tempVariable = tempVariable * nums[i];
		}
		
		return resultArray;
	}

}
