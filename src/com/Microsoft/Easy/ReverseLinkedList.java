package com.Microsoft.Easy;

public class ReverseLinkedList {

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
		l11.next = l12;
		l12.next = l13;
		l13.next = l14;
		l14.next = null;

		ListNode inputList = l11;
		System.out.print("Input List => ");
		while (inputList != null) {
			System.out.print(inputList.val + " ");
			inputList = inputList.next;
		}
		System.out.println();

		ListNode resultNode = reverseList(l11);

		ListNode outputList = resultNode;
		System.out.print("Reversed List => ");
		while (outputList != null) {
			System.out.print(outputList.val + " ");
			outputList = outputList.next;
		}
		System.out.println();
	}

	private static ListNode reverseList(ListNode head) {
		ListNode previous = null;
		ListNode current = head;

		while (current != null) {
			ListNode tempNode = current.next;
			current.next = previous;
			previous = current;
			current = tempNode;
		}
		return previous;

//		if (head == null || head.next == null) {
//			return head;
//		}
//		ListNode tempNode = reverseList(head.next);
//		head.next.next = head;
//		head.next = null;
//		return tempNode;
	}

}
