package com.problem.easy;

public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(1));
		System.out.println(countAndSay(2));
		System.out.println(countAndSay(3));
		System.out.println(countAndSay(4));
		System.out.println(countAndSay(5));
		System.out.println(countAndSay(6));
	}

	private static String countAndSay(int n) {
		StringBuilder resultString = new StringBuilder("1");
		StringBuilder tempString;
		char sayString;
		int count;

		for (int i = 1; i < n; i++) {
			tempString = resultString;
			sayString = tempString.charAt(0);
			count = 1;
			resultString = new StringBuilder();

			for (int j = 1; j < tempString.length(); j++) {
				if (tempString.charAt(j) != sayString) {
					resultString.append(count).append(sayString);
					count = 1;
					sayString = tempString.charAt(j);
				} else {
					count++;
				}
			}
			resultString.append(count).append(sayString);
		}
		return resultString.toString();
	}

}
