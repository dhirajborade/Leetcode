package com.Microsoft.Medium;

public class SwapNodesInPairs {

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(2);
		ListNode b3 = new ListNode(3);
		ListNode b4 = new ListNode(4);
		ListNode b5 = new ListNode(5);
		ListNode b6 = new ListNode(6);
		b1.next = b2;
		b2.next = b3;
		b3.next = b4;
		b4.next = b5;
		b5.next = b6;

		ListNode listA = b1;
		System.out.print("Input List => ");
		while (listA != null) {
			System.out.print(listA.val + " ");
			listA = listA.next;
		}
		System.out.println();

		ListNode result = swapPairs(b1);
		listA = result;
		System.out.print("Input List => ");
		while (listA != null) {
			System.out.print(listA.val + " ");
			listA = listA.next;
		}
		System.out.println();
	}

	private static ListNode swapPairs(ListNode head) {
		// if (head == null || head.next == null) {
		// return head;
		// }
		// ListNode tempNode = head.next;
		// head.next = swapPairs(head.next.next);
		// tempNode.next = head;
		// return tempNode;

		ListNode currentNode = head;
		ListNode resultNode = currentNode.next;

		while (true) {
			ListNode previousNode = currentNode.next;
			ListNode tempNode = previousNode.next;
			previousNode.next = currentNode;
			if (tempNode == null || tempNode.next == null) {
				currentNode.next = tempNode;
				break;
			}
			currentNode.next = tempNode.next;
			currentNode = tempNode;
		}
		return resultNode;
	}

}
