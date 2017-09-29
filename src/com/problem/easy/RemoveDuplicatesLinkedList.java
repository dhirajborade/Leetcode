package com.problem.easy;



public class RemoveDuplicatesLinkedList {

	public static void main(String[] args) {
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(1);
		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(3);
		ListNode node5 = new ListNode(3);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;

		ListNode node6 = new ListNode(1);
		ListNode node7 = new ListNode(1);
		ListNode node8 = new ListNode(2);
		node6.next = node7;
		node7.next = node8;
		
		ListNode tempNode1 = node1;
		System.out.print("List One => ");
		while (tempNode1 != null) {
			System.out.print(tempNode1.val + " ");
			tempNode1 = tempNode1.next;
		}
		System.out.println();
		
		ListNode result = deleteDuplicates(node1);

		ListNode tempNode2 = result;
		System.out.print("List One with Unique Elements => ");
		while (tempNode2 != null) {
			System.out.print(tempNode2.val + " ");
			tempNode2 = tempNode2.next;
		}
		System.out.println();
		System.out.println();
		
		ListNode tempNode3 = node6;
		System.out.print("List Two => ");
		while (tempNode3 != null) {
			System.out.print(tempNode3.val + " ");
			tempNode3 = tempNode3.next;
		}
		System.out.println();

		result = deleteDuplicates(node6);

		ListNode tempNode4 = result;
		System.out.print("List Two with Unique Elements => ");
		while (tempNode4 != null) {
			System.out.print(tempNode4.val + " ");
			tempNode4 = tempNode4.next;
		}
		System.out.println();
	}

	private static ListNode deleteDuplicates(ListNode head) {
//		ListNode tempNode = head;
//		ListNode resultList = new ListNode(head.val);
//		ListNode result = resultList;
//		int nodeValue;
//		while (tempNode.next != null) {
//			nodeValue = tempNode.val;
//			tempNode = tempNode.next;
//			while (tempNode.val == nodeValue) {
//				tempNode = tempNode.next;
//				if (tempNode == null) {
//					break;
//				}
//			}
//			if (tempNode == null) {
//				break;
//			}
//			resultList.next = new ListNode(tempNode.val);
//			resultList = resultList.next;
//		}
//		return result;
		
		ListNode currentNode = head;
		while (currentNode != null && currentNode.next != null) {
			if (currentNode.next.val == currentNode.val) {
				currentNode.next = currentNode.next.next;
			} else {
				currentNode = currentNode.next;
			}
		}
		return head;
	}

}
