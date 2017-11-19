package com.Microsoft.Medium;

import java.util.Stack;

public class ValidateBST {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.left.right.left = new TreeNode(3);
		root.right.right = new TreeNode(7);
		System.out.println(isValidBST(root));
	}

	private static boolean isValidBST(TreeNode root) {
		if (root == null) {
			return true;
		}
		Stack<TreeNode> treeStack = new Stack<>();
		TreeNode previousNode = null;
		while (root != null || !treeStack.isEmpty()) {
			while (root != null) {
				treeStack.push(root);
				root = root.left;
			}
			root = treeStack.pop();
			if (previousNode != null && root.val <= previousNode.val) {
				return false;
			}
			previousNode = root;
			root = root.right;
		}
		return true;
	}

}
