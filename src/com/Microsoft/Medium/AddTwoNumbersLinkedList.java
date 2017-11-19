package com.Microsoft.Medium;

import java.util.Stack;

public class AddTwoNumbersLinkedList {
	
	private static class ListNode {
		private int val;
		private ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		ListNode l11 = new ListNode(7);
		ListNode l12 = new ListNode(2);
		ListNode l13 = new ListNode(4);
		ListNode l14 = new ListNode(3);
		ListNode l21 = new ListNode(5);
		ListNode l22 = new ListNode(6);
		ListNode l23 = new ListNode(4);
		l11.next = l12;
		l12.next = l13;
		l13.next = l14;
		l21.next = l22;
		l22.next = l23;
		
		ListNode inputListOne = l11;
		System.out.print("List One => ");
		while (inputListOne != null) {
			System.out.print(inputListOne.val + " ");
			inputListOne = inputListOne.next;
		}
		System.out.println();
		
		ListNode inputListTwo = l21;
		System.out.print("List Two => ");
		while (inputListTwo != null) {
			System.out.print(inputListTwo.val + " ");
			inputListTwo = inputListTwo.next;
		}
		System.out.println();
		
		ListNode outputList = addTwoNumbers(l11, l21);
		System.out.print("Output List => ");
		while (outputList != null) {
			System.out.print(outputList.val + " ");
			outputList = outputList.next;
		}
		System.out.println();
	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		Stack<Integer> myStackOne = new Stack<>();
		Stack<Integer> myStackTwo = new Stack<>();
		
		while (l1 != null) {
			myStackOne.push(l1.val);
			l1 = l1.next;
		}
		
		while (l2 != null) {
			myStackTwo.push(l2.val);
			l2 = l2.next;
		}
		
		int sum = 0;
		ListNode head = new ListNode(0);
		
		while (!myStackOne.isEmpty() || !myStackTwo.isEmpty()) {
			if (!myStackOne.isEmpty()) {
				sum += myStackOne.pop();
			}
			if (!myStackTwo.isEmpty()) {
				sum += myStackTwo.pop();
			}
			head.val = sum % 10;
			ListNode currentNode = new ListNode(sum / 10);
			sum /= 10;
			currentNode.next = head;
			head = currentNode;
		}
		
		return head.val == 0 ? head.next : head;
	}

}
