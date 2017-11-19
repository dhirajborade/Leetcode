package com.Microsoft.Easy;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(3);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		System.out.println(isSymmetric(root));
	}

	private static boolean isSymmetric(TreeNode root) {
		// return isMirror(root, root);

		Queue<TreeNode> myQueue = new LinkedList<>();
		myQueue.add(root);
		myQueue.add(root);

		while (!myQueue.isEmpty()) {
			TreeNode treeOne = myQueue.poll();
			TreeNode treeTwo = myQueue.poll();
			if (treeOne == null && treeTwo == null) {
				continue;
			}
			if (treeOne == null || treeTwo == null) {
				return false;
			}
			if (treeOne.val != treeTwo.val) {
				return false;
			}
			myQueue.add(treeOne.left);
			myQueue.add(treeTwo.right);
			myQueue.add(treeOne.right);
			myQueue.add(treeTwo.left);
		}
		return true;
	}

	// private static boolean isMirror(TreeNode treeOne, TreeNode treeTwo) {
	// if (treeOne == null && treeTwo == null) {
	// return true;
	// }
	// if (treeOne == null || treeTwo == null) {
	// return false;
	// }
	// return (treeOne.val == treeTwo.val) && isMirror(treeOne.left, treeTwo.right)
	// && isMirror(treeOne.right, treeTwo.left);
	// }

}
