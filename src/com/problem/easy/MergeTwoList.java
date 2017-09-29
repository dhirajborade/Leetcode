package com.problem.easy;

public class MergeTwoList {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(6);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		ListNode node6 = new ListNode(0);
		ListNode node7 = new ListNode(2);
		ListNode node8 = new ListNode(4);
		ListNode node9 = new ListNode(8);
		ListNode node10 = new ListNode(10);
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;

		ListNode tempNode1 = node1;
		System.out.print("List One => ");
		while (tempNode1 != null) {
			System.out.print(tempNode1.val + " ");
			tempNode1 = tempNode1.next;
		}
		System.out.println();

		ListNode tempNode2 = node6;
		System.out.print("List Two => ");
		while (tempNode2 != null) {
			System.out.print(tempNode2.val + " ");
			tempNode2 = tempNode2.next;
		}
		System.out.println();

		ListNode result = mergeTwoLists(node1, node6);

		ListNode tempNode3 = result;
		System.out.print("Merged List => ");
		while (tempNode3 != null) {
			System.out.print(tempNode3.val + " ");
			tempNode3 = tempNode3.next;
		}
		System.out.println();

	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//		ListNode result = new ListNode(Math.min(l1.val, l2.val));
//		ListNode head = result;
//		if (l1.val <= l2.val) {
//			l1 = l1.next;
//		} else {
//			l2 = l2.next;
//		}
//		while (l1 != null && l2 != null) {
//			if (l1.val >= l2.val) {
//				result.next = new ListNode(l2.val);
//				l2 = l2.next;
//			} else {
//				result.next = new ListNode(l1.val);
//				l1 = l1.next;
//			}
//			result = result.next;
//		}
//		if (l1 == null) {
//			while (l2 != null) {
//				result.next = new ListNode(l2.val);
//				l2 = l2.next;
//				result = result.next;
//			}
//		} else if (l2 == null) {
//			while (l1 != null) {
//				result.next = new ListNode(l1.val);
//				l1 = l1.next;
//				result = result.next;
//			}
//		}
//		return head;
		
//		ListNode resultList = new ListNode(Integer.MIN_VALUE);
//		ListNode tempList = resultList;
//		
//		while (l1 != null && l2 != null) {
//			if (l1.val < l2.val) {
//				tempList.next = l1;
//				l1 = l1.next;
//			} else {
//				tempList.next = l2;
//				l2 = l2.next;
//			}
//			tempList = tempList.next;
//		}
//		tempList.next = l1 != null ? l1 : l2;
//		return resultList.next;
		
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}

}
