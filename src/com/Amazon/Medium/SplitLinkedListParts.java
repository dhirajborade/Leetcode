/**
 *
 */
package com.Amazon.Medium;

/**
 * @author dhirajborade
 *
 */
public class SplitLinkedListParts {

	private static class ListNode {
		ListNode next;

		ListNode(int x) {
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l011 = new ListNode(1);
		ListNode l012 = new ListNode(2);
		ListNode l013 = new ListNode(3);
		l011.next = l012;
		l012.next = l013;

		ListNode l111 = new ListNode(1);
		ListNode l112 = new ListNode(2);
		ListNode l113 = new ListNode(3);
		ListNode l114 = new ListNode(4);
		ListNode l115 = new ListNode(5);
		ListNode l116 = new ListNode(6);
		ListNode l117 = new ListNode(7);
		ListNode l118 = new ListNode(8);
		ListNode l119 = new ListNode(9);
		ListNode l110 = new ListNode(10);
		l111.next = l112;
		l112.next = l113;
		l113.next = l114;
		l114.next = l115;
		l115.next = l116;
		l116.next = l117;
		l117.next = l118;
		l118.next = l119;
		l119.next = l110;

		splitListToParts(l011, 5);
		splitListToParts(l111, 3);
	}

	private static ListNode[] splitListToParts(ListNode root, int k) {
		ListNode curr = root;
		int N = 0;
		while (curr != null) {
			curr = curr.next;
			N++;
		}

		int width = N / k;
		int remaining = N % k;

		ListNode[] result = new ListNode[k];

		curr = root;

		for (int i = 0; i < k; ++i) {
			ListNode head = curr;
			for (int j = 0; j < width + (i < remaining ? 1 : 0); ++j) {
				if (curr != null) {
					curr = curr.next;
				}
			}
			if (curr != null) {
				ListNode prev = curr;
				curr = curr.next;
				prev.next = null;
			}
			result[i] = head;
		}
		return result;
	}

}
