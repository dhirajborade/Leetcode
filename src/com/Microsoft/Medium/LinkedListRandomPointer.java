package com.Microsoft.Medium;

import java.util.HashMap;

public class LinkedListRandomPointer {

	public static class RandomListNode {
		int label;
		RandomListNode next, random;

		RandomListNode(int x) {
			this.label = x;
		}
	};

	public static void main(String[] args) {
		RandomListNode nodeOne = new RandomListNode(2);
		RandomListNode nodeTwo = new RandomListNode(1);
		RandomListNode nodeThree = new RandomListNode(3);
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
		System.out.print("Copy Normal List => ");
		while (tempNodeThree != null) {
			System.out.print(tempNodeThree.label + " ");
			tempNodeThree = tempNodeThree.next;
			count++;
		}
		System.out.println();

		RandomListNode tempNodeFour = result;
		count = 3;
		System.out.print("Copy Random List => ");
		while (count > 0) {
			System.out.print(tempNodeFour.label + " ");
			tempNodeFour = tempNodeFour.random;
			count--;
		}
		System.out.println();
		System.out.println();
	}

	public static RandomListNode copyRandomList(RandomListNode head) {
		if (head == null) {
			return null;
		}
		
		HashMap<RandomListNode, RandomListNode> myMap = new HashMap<RandomListNode, RandomListNode>();
		
		RandomListNode dummyNode = head;
		
		while (dummyNode != null) {
			myMap.put(dummyNode, new RandomListNode(dummyNode.label));
			dummyNode = dummyNode.next;
		}
		
		dummyNode = head;
		
		while (dummyNode != null) {
			myMap.get(dummyNode).next = myMap.get(dummyNode.next);
			myMap.get(dummyNode).random = myMap.get(dummyNode.random);
			dummyNode = dummyNode.next;
		}
		
		return myMap.get(head);
	}

}
