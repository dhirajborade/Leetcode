package com.Microsoft.Easy;

public class LinkedListCycle {

	private static class ListNode {
		ListNode next;

		ListNode(int x) {
			next = null;
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
		l14.next = l12;
		boolean result = hasCycle(l11);
		System.out.println(result == true ? "Linked List has a Cycle" : "Linked List does not have any cycle");
	}

	private static boolean hasCycle(ListNode head) {
		// Set<ListNode> mySet = new HashSet<>();
		// while (head != null) {
		// if (mySet.contains(head)) {
		// return true;
		// }
		// mySet.add(head);
		// head = head.next;
		// }
		// return false;

		if (head == null || head.next == null) {
			return false;
		}
		ListNode slowPointer = head;
		ListNode fastPointer = head.next;

		while (slowPointer != fastPointer) {
			if (fastPointer == null || fastPointer.next == null) {
				return false;
			}
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
		}
		return true;
	}
}
