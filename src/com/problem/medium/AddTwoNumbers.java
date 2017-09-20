package com.problem.medium;

public class AddTwoNumbers {

	private static class ListNode {
		private int val;
		private ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(8);
		ListNode l21 = new ListNode(0);
		l11.next = l12;
		l12.next = null;
		l21.next = null;
		ListNode outputList = addTwoNumbers(l11, l21);
		while (outputList != null) {
			System.out.println(outputList.val);
			outputList = outputList.next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode previous = new ListNode(0);
		ListNode head = previous;
		int carry = 0;
		while (l1 != null || l2 != null || carry != 0) {
			ListNode current = new ListNode(0);
			int sum = ((l2 == null) ? 0 : l2.val) + ((l1 == null) ? 0 : l1.val) + carry;
			current.val = sum % 10;
			carry = sum / 10;
			previous.next = current;
			previous = current;
			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}
		}
		return head.next;
	}

}
