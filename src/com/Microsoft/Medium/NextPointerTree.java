package com.Microsoft.Medium;

public class NextPointerTree {

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
		root.right.left = new TreeLinkNode(6);
		root.right.right = new TreeLinkNode(7);
		lowestCommonAncestor(root);
	}

	private static void lowestCommonAncestor(TreeLinkNode root) {
		if (root == null) {
			return;
		}
		TreeLinkNode currentNode = null;
		TreeLinkNode previousNode = root;
		
		while (previousNode.left != null) {
			currentNode = previousNode;
			while (currentNode != null) {
				currentNode.left.next = currentNode.right;
				if (currentNode.next != null) {
					currentNode.right.next = currentNode.next.left;
				}
				currentNode = currentNode.next;
			}
			previousNode = previousNode.left;
		}
	}

}
