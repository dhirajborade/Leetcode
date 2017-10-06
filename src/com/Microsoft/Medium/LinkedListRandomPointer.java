package com.Microsoft.Medium;

import com.problem.easy.ListNode;

public class LinkedListRandomPointer {

	class RandomListNode {
		int label;
		RandomListNode next, random;

		RandomListNode(int x) {
			this.label = x;
		}
	};

	public static void main(String[] args) {
		LinkedListRandomPointer myList = new LinkedListRandomPointer();
		RandomListNode nodeOne = myList.new RandomListNode(2);
		RandomListNode nodeTwo = myList.new RandomListNode(1);
		RandomListNode nodeThree = myList.new RandomListNode(3);
		nodeOne.next = nodeTwo;
		nodeTwo.next = nodeThree;
		nodeThree.next = null;
		nodeOne.random = nodeThree;
		nodeTwo.random = nodeOne;
		nodeThree.random = nodeTwo;
		
		int count = 0;
		
		RandomListNode tempNodeOne = nodeOne;
		System.out.print("Normal List => ");
		while (tempNodeOne != null) {
			System.out.print(tempNodeOne.label + " ");
			tempNodeOne = tempNodeOne.next;
			count++;
		}
		System.out.println();

		RandomListNode tempNodeTwo = nodeOne;
		System.out.print("Random List => ");
		while (count > 0) {
			System.out.print(tempNodeTwo.label + " ");
			tempNodeTwo = tempNodeTwo.random;
			count--;
		}
		System.out.println();
		System.out.println();
		
		RandomListNode result = copyRandomList(nodeOne);
		
		RandomListNode tempNodeThree = result;
		System.out.print("Normal List => ");
		while (tempNodeThree != null) {
			System.out.print(tempNodeThree.label + " ");
			tempNodeThree = tempNodeThree.next;
			count++;
		}
		System.out.println();

		RandomListNode tempNodeFour = result;
		count = 3;
		System.out.print("Random List => ");
		while (count > 0) {
			System.out.print(tempNodeFour.label + " ");
			tempNodeFour = tempNodeFour.random;
			count--;
		}
		System.out.println();
		System.out.println();
	}

	public static RandomListNode copyRandomList(RandomListNode head) {
		return head;
	}

}
