package com.Amazon.Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeBinaryTree {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}
		t1.val += t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t1.right = mergeTrees(t1.right, t2.right);
		return t1;
	}

	private static List<List<String>> printTree(TreeNode root) {
		int height = getHeight(root);
		String[][] res = new String[height][(1 << height) - 1];
		for (String[] arr : res)
			Arrays.fill(arr, "");
		List<List<String>> ans = new ArrayList<>();
		fill(res, root, 0, 0, res[0].length);
		for (String[] arr : res)
			ans.add(Arrays.asList(arr));
		return ans;
	}

	private static void fill(String[][] res, TreeNode root, int i, int l, int r) {
		if (root == null)
			return;
		res[i][(l + r) / 2] = "" + root.val;
		fill(res, root.left, i + 1, l, (l + r) / 2);
		fill(res, root.right, i + 1, (l + r + 1) / 2, r);
	}

	private static int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + Math.max(getHeight(root.left), getHeight(root.right));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);

		System.out.println(printTree(t1));

		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4);
		t2.right.right = new TreeNode(7);

		System.out.println(printTree(t2));

		TreeNode result = mergeTrees(t1, t2);

		System.out.println(printTree(result));
	}

}
