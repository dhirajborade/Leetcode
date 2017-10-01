package com.problem.easy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String input1 = "()";
		String input2 = "()[]{}";
		String input3 = "(]";
		String input4 = "[()";
		String[] input = { "{{}(", "()[]{}", input1, input2, input3, input4 };
		String[] result = isValid(input);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}

	private static String[] isValid(String[] inputString) {
		String[] result = new String[inputString.length];
		for (int i = 0; i < inputString.length; i++) {
			result[i] = "YES";
			Stack<Character> myStack = new Stack<>();
			for (int j = 0; j < inputString[i].length(); j++) {
				if (inputString[i].charAt(j) == '(')
					myStack.push(')');
				else if (inputString[i].charAt(j) == '[')
					myStack.push(']');
				else if (inputString[i].charAt(j) == '{')
					myStack.push('}');
				else if (myStack.isEmpty() || myStack.pop() != inputString[i].charAt(j))
					result[i] = "NO";
			}
			if (!myStack.isEmpty()) {
				result[i] = "NO";
			}
		}
		return result;
	}

}
