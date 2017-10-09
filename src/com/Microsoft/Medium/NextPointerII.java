package com.Microsoft.Medium;

public class NextPointerII {

	private static class TreeLinkNode {
		TreeLinkNode left;
		TreeLinkNode right;
		TreeLinkNode next;

		TreeLinkNode(int x) {
		}
	}

	public static void main(String[] args) {
		TreeLinkNode root = new TreeLinkNode(1);
		root.left = new TreeLinkNode(2);
		root.right = new TreeLinkNode(3);
		root.left.left = new TreeLinkNode(4);
		root.left.right = new TreeLinkNode(5);
		root.right.right = new TreeLinkNode(7);
		connect(root);
	}

	private static void connect(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		TreeLinkNode dummyNode = new TreeLinkNode(-1);
		TreeLinkNode previousNode = dummyNode;
		
		while (root != null) {
			if (root.left != null) {
				previousNode.next = root.left;
				previousNode = previousNode.next;
			}
			if (root.right != null) {
				previousNode.next = root.right;
				previousNode = previousNode.next;
			}
			root = root.next;
			if (root == null) {
				previousNode = dummyNode;
				root = dummyNode.next;
				dummyNode.next = null;
			}
		}
	}

}