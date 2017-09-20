package com.problem.easy;

import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		String input1 = "()";
		String input2 = "()[]{}";
		String input3 = "(]";
		String input4 = "[()";
		System.out.println(isValid(input1));
		System.out.println(isValid(input2));
		System.out.println(isValid(input3));
		System.out.println(isValid(input4));
	}

	private static boolean isValid(String inputString) {
		Stack<Character> myStack = new Stack<>();
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == '(')
				myStack.push(')');
			else if (inputString.charAt(i) == '[')
				myStack.push(']');
			else if (inputString.charAt(i) == '{')
				myStack.push('}');
			else if (myStack.isEmpty() || myStack.pop() != inputString.charAt(i))
				return false;
		}
		return myStack.isEmpty();
	}

}
