package com.Amazon.Easy;

public class StringFromBinary {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private static String tree2str(TreeNode t) {
		if (t == null) {
			return "";
		}
		if (t.left == null && t.right == null) {
			return t.val + "";
		}
		if (t.right == null) {
			return t.val + "(" + tree2str(t.left) + ")";
		}
		return t.val + "(" + tree2str(t.left) + ")" + "(" + tree2str(t.right) + ")";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(5);
		root.right.right = new TreeNode(8);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(9);
		System.out.println(tree2str(root));
	}

}
