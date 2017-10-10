package com.Microsoft.Easy;

import java.util.Stack;

public class QueueUsingStacks {

	private static Stack<Integer> enqueStack;
	private static Stack<Integer> dequeStack;

	/** Initialize your data structure here. */
	public QueueUsingStacks() {
		enqueStack = new Stack<>();
		dequeStack = new Stack<>();
	}

	public static void main(String[] args) {
		QueueUsingStacks myQueue = new QueueUsingStacks();
		int param_1 = 1;
		int param_5 = 2;
		myQueue.push(param_1);
		myQueue.push(param_5);
		myQueue.push(3);
		myQueue.push(4);
		myQueue.push(5);
		myQueue.push(6);
		myQueue.push(7);
		int param_2 = myQueue.pop();
		int param_6 = myQueue.pop();
		int param_3 = myQueue.peek();
		boolean param_4 = myQueue.empty();
		System.out.println(param_1);
		System.out.println(param_2);
		System.out.println(param_3);
		System.out.println(param_4);
	}

	/** Push element x to the back of queue. */
	private void push(int x) {
		if (dequeStack.empty())
			dequeStack.push(x);
		else
			enqueStack.push(x);
	}

	/** Removes the element from in front of queue and returns that element. */
	private int pop() {
		if (dequeStack.size() > 1)
			return dequeStack.pop();
		int curr = dequeStack.pop();
		while (!enqueStack.empty())
			dequeStack.push(enqueStack.pop());
		return curr;
	}

	/** Get the front element. */
	private int peek() {
		return dequeStack.peek();
	}

	/** Returns whether the queue is empty. */
	private boolean empty() {
		return dequeStack.empty();
	}

}
