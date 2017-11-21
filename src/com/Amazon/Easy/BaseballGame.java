package com.Amazon.Easy;

import java.util.Stack;

public class BaseballGame {

	private static int calPoints(String[] ops) {
		int finalScore = 0;
		Stack<Integer> myStack = new Stack<Integer>();
		for (String op : ops) {
			switch (op) {
			case "+":
				int getTop = myStack.pop();
				int newTop = getTop + myStack.peek();
				myStack.push(getTop);
				myStack.push(newTop);
				break;

			case "C":
				myStack.pop();
				break;

			case "D":
				myStack.push(2 * myStack.peek());
				break;

			default:
				myStack.push(Integer.valueOf(op));
				break;
			}
		}

		for (int entry : myStack) {
			finalScore += entry;
		}
		return finalScore;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(calPoints(new String[] { "5", "2", "C", "D", "+" }));
		System.out.println(calPoints(new String[] { "5", "-2", "4", "C", "D", "9", "+", "+" }));
	}

}
