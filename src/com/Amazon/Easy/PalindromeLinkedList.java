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
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(2);
		ListNode l14 = new ListNode(1);
		l11.next = l12;
		l12.next = l13;
		l13.next = l14;
		boolean result = isPalindrome(l11);
		System.out.println(result == true ? "Linked List is a Palindrome" : "Linked List is not a Palindrome");
	}

}
