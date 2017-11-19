package com.Playground;

import java.util.ArrayList;

// Please implement the serializer and deserializer for char array below.
// For char arrays, we follow the JSON standard according to http://www.json.org/
// Therefore, a single character A is represented as "A" (wrapped in double quotes instead of single quotes).
// A char array containing 3 elements "A", "B", "C" is represented in string as ["A","B","C"].
// For the purpose of this problem, you must not use JSON parser library or eval method. 
// Standard library provided by the language (not including JSON library) is allowed.

public class CharArray {
	public static String charArrayToString(char[] param) throws Exception {
		// throw new Exception("Function Not implemented yet.");
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < param.length; i++) {
			sb.append("\"");
			sb.append(param[i]);
			sb.append("\"");
			if (i != param.length - 1) {
				sb.append(",");
			}
		}
		sb.append("]");
		return sb.toString();
	}

	// Bonus point if your deserializer is able to deal with whitespaces between
	// elements.
	// For example: param = "[ \"a\", \"b\", \"c\" ]"
	public static char[] stringToCharArray(String param) throws Exception {
		// throw new Exception("Function Not implemented yet.");
		ArrayList<Character> myList = new ArrayList<Character>();
		int rightIndex = 0;
		while (rightIndex < param.length()) {
			if (param.charAt(rightIndex) == '\"' && param.charAt(rightIndex + 1) != ','
					&& param.charAt(rightIndex + 1) != ']') {
				rightIndex++;
				myList.add(param.charAt(rightIndex));
			}
			rightIndex++;
		}
		char[] result = new char[myList.size()];

		for (int i = 0; i < result.length; i++) {
			result[i] = myList.get(i);
		}
		return result;
	}

	// Note: These tests are basic and passing them does not mean your code is
	// correct.
	// Feel free to write additional tests and test serializer and deserializer
	// individually.
	public static void main(String[] args) {
		String[] testcases = { "[]", "[\"a\",\"b\",\"c\"]", "[\"T\",\"e\",\"!\",\"'\"]", "[\"'\",\"\\\"\",\"c\"]",
				"[\"\\n\",\"\\t\",\"'\",\"\\\"\",\"\\\\\"]" };

		for (String testcase : testcases) {
			try {
				if (!charArrayToString(stringToCharArray(testcase)).equals(testcase)) {
					System.out.println("TESTCASE FAILED : {}" + testcase);
				} else {
					System.out.println("TESTCASE PASSED");
				}
			} catch (Exception e) {
				System.out.println("Exception occured in testcase : " + testcase);
				break;
			}
		}
	}
}
