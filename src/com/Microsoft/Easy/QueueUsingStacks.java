package com.Microsoft.Easy;

import java.util.Stack;

public class QueueUsingStacks {

	private static Stack<Integer> stackOne = new Stack<>();
	private static Stack<Integer> stackTwo = new Stack<>();
	private static int front;

	/** Initialize your data structure here. */
	public QueueUsingStacks() {

	}

	public static void main(String[] args) {
		int param_1 = 1;
		push(param_1);
		int param_2 = pop();
		int param_3 = peek();
		boolean param_4 = empty();
		System.out.println(param_1);
		System.out.println(param_2);
		System.out.println(param_3);
		System.out.println(param_4);
	}

	/** Push element x to the back of queue. */
	private static void push(int x) {
		if (stackOne.isEmpty()) {
			front = x;
		}
		stackOne.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	private static int pop() {
		if (stackTwo.isEmpty()) {
			while (!stackOne.isEmpty()) {
				stackTwo.push(stackOne.pop());
			}
		}
		return stackTwo.pop();
	}

	/** Get the front element. */
	private static int peek() {
		if (!stackTwo.isEmpty()) {
			return stackTwo.peek();
		}
		return front;
	}

	/** Returns whether the queue is empty. */
	private static boolean empty() {
		return stackOne.isEmpty() && stackTwo.isEmpty();
	}

}
