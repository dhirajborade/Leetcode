package com.Microsoft.Medium;

public class CopyListRandomPointer {

	class RandomListNode {
		int label;
		RandomListNode next, random;

		RandomListNode(int x) {
			this.label = x;
		}
	}

	public static void main(String[] args) {
		CopyListRandomPointer x = new CopyListRandomPointer();
		RandomListNode node1 = x.new RandomListNode(4);
		RandomListNode node2 = x.new RandomListNode(2);
		RandomListNode node3 = x.new RandomListNode(7);
		RandomListNode node4 = x.new RandomListNode(3);
		RandomListNode node5 = x.new RandomListNode(9);
		RandomListNode node6 = x.new RandomListNode(1);
		RandomListNode node7 = x.new RandomListNode(6);
		RandomListNode node8 = x.new RandomListNode(8);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node1.random = node6;
		node2.random = node7;
		node5.random = node8;
	}

}
