package com.Microsoft.Easy;

public class IntersectionLinkedList {

	private static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode b1 = new ListNode(10);
		ListNode b2 = new ListNode(20);
		ListNode b3 = new ListNode(30);
		ListNode c1 = new ListNode(3);
		ListNode c2 = new ListNode(4);
		ListNode c3 = new ListNode(5);
		a1.next = a2;
		a2.next = c1;
		b1.next = b2;
		b2.next = b3;
		b3.next = c1;
		c1.next = c2;
		c2.next = c3;

		ListNode listA = a1;
		System.out.print("Input List => ");
		while (listA != null) {
			System.out.print(listA.val + " ");
			listA = listA.next;
		}
		System.out.println();

		ListNode listB = b1;
		System.out.print("Input List => ");
		while (listB != null) {
			System.out.print(listB.val + " ");
			listB = listB.next;
		}
		System.out.println();

		ListNode intersectionNode = getIntersectionNode(a1, b1);

		System.out.println(intersectionNode.val);
	}

	private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		
		ListNode tempA = headA;
		ListNode tempB = headB;
		
		while (tempA != tempB) {
			tempA = tempA == null ? headB : tempA.next;
			tempB = tempB == null ? headA : tempB.next;
		}
		
		return tempA;
	}

}
