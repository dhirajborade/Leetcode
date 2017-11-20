package com.Amazon.Easy;

public class PalindromeLinkedList {

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	private static boolean isPalindrome(ListNode head) {
		ListNode reverseNode = null;
		ListNode slowNode = head;
		ListNode fastNode = head;

		while (fastNode != null && fastNode.next != null) {
			fastNode = fastNode.next.next;
			ListNode tempReverseNode = reverseNode;
			ListNode tempSlowNode = slowNode.next;
			reverseNode = slowNode;
			reverseNode.next = tempReverseNode;
			slowNode = tempSlowNode;
		}

		if (fastNode != null) {
			slowNode = slowNode.next;
		}

		while (reverseNode != null && reverseNode.val == slowNode.val) {
			slowNode = slowNode.next;
			reverseNode = reverseNode.next;
		}

		return reverseNode == null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(3);
		ListNode l14 = new ListNode(2);
		ListNode l15 = new ListNode(1);
		l11.next = l12;
		l12.next = l13;
		l13.next = l14;
		l14.next = l15;
		boolean result = isPalindrome(l11);
		System.out.println(result == true ? "Linked List is a Palindrome" : "Linked List is not a Palindrome");
	}

}
