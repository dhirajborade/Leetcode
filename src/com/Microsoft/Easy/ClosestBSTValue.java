package com.Microsoft.Easy;

public class ClosestBSTValue {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(8);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(9);
		int closestNode = closestValue(root, 6.5);
		System.out.println(closestNode);
	}

	private static int closestValue(TreeNode root, double target) {
		int value = root.val;
		TreeNode child = target < value ? root.left : root.right;
		if (child == null) {
			return value;
		}
		int childValue = closestValue(child, target);
		return Math.abs(value - target) < Math.abs(childValue - target) ? value : childValue;
	}

}
