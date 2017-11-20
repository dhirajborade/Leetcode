package com.Amazon.Easy;

import java.util.Stack;

public class MinStack {
	
	private static long minValue;
	private static Stack<Long> myStack;

	/** initialize your data structure here. */
	public MinStack() {
		myStack = new Stack<Long>();
	}

	public void push(int x) {
		if (myStack.isEmpty()) {
			myStack.push(0L);
			minValue = x;
		} else {
			myStack.push(x - minValue);
			if (x < minValue) {
				minValue = x;
			}
		}
	}

	public void pop() {
		if (myStack.isEmpty()) {
			return;
		}
		long poppedValue = myStack.pop();
		if (poppedValue < 0) {
			minValue -= poppedValue;
		}
	}

	public int top() {
		long stackTop = myStack.peek();
		if (stackTop > 0) {
			return (int) (stackTop + minValue);
		} else {
			return (int) minValue;
		}
	}

	public int getMin() {
		return (int) minValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack obj = new MinStack();
		obj.push(1);
		obj.push(2);
		obj.push(100);
		obj.push(12);
		obj.push(3);
		obj.pop();
		int param_3 = obj.top();
		int param_4 = obj.getMin();
		System.out.println(param_3);
		System.out.println(param_4);
	}

}
