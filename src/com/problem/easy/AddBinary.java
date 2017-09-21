package com.problem.easy;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AddBinary {

	public static void main(String[] args) {
		assertThat(addBinary("11", "1"), is("100"));
		System.out.println("All Test Cases passed");
	}
	
	public static String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();
		int indexA = a.length() - 1;
		int indexB = b.length() - 1;
		int carry = 0;
		
		while (indexA >= 0 || indexB >= 0) {
			int sum = carry;
			if (indexB >= 0) {
				sum += b.charAt(indexB--) - '0';
			}
			if (indexA >= 0) {
				sum += a.charAt(indexA--) - '0';
			}
			result.append(sum % 2);
			carry = sum / 2;
		}
		
		if (carry != 0) {
			result.append(carry);
		}
		
		return result.reverse().toString();
	}

}
