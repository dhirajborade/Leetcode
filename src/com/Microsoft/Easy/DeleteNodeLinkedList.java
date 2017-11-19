package com.Microsoft.Easy;

public class DeleteNodeLinkedList {

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {

		ListNode l11 = new ListNode(7);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		ListNode l14 = new ListNode(3);
		ListNode l15 = new ListNode(10);
		l11.next = l12;
		l12.next = l13;
		l13.next = l14;
		l14.next = l15;
		l15.next = null;

		ListNode inputList = l11;
		System.out.print("Input List => ");
		while (inputList != null) {
			System.out.print(inputList.val + " ");
			inputList = inputList.next;
		}
		System.out.println();

		deleteNode(l13);

		ListNode outputList = l11;
		System.out.print("After Deleting Node => ");
		while (outputList != null) {
			System.out.print(outputList.val + " ");
			outputList = outputList.next;
		}
		System.out.println();

	}

	private static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}
