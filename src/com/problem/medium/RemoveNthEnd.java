package com.problem.medium;

import com.problem.medium.ListNode;

public class RemoveNthEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		
		ListNode tempNode1 = node1;
		System.out.print("List One => ");
		while (tempNode1 != null) {
			System.out.print(tempNode1.val + " ");
			tempNode1 = tempNode1.next;
		}
		System.out.println();
		
		ListNode result = removeNthFromEnd(node1, 2);
		
		ListNode tempNode2 = result;
		System.out.print("List One => ");
		while (tempNode2 != null) {
			System.out.print(tempNode2.val + " ");
			tempNode2 = tempNode2.next;
		}
		System.out.println();
	}
	
	private static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummyNode = new ListNode(0);
		dummyNode.next = head;
        ListNode slow = dummyNode;
        ListNode fast = dummyNode;
        
        for (int i = 1; i <= n + 1; i++) {
        	fast = fast.next;
        }
        
        while (fast != null) {
        	fast = fast.next;
        	slow = slow.next;
        }
        
        slow.next = slow.next.next;
        return dummyNode.next;
    }

}
