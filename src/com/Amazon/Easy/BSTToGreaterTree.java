/**
 *
 */
package com.Amazon.Easy;

/**
 * @author dhirajborade
 *
 */
public class BSTToGreaterTree {

	private static int sumVal = 0;

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private static TreeNode convertBST(TreeNode root) {
		if (root != null) {
			convertBST(root.right);
			sumVal += root.val;
			root.val = sumVal;
			convertBST(root.left);
		}
		return root;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(5);
		t1.left = new TreeNode(2);
		t1.right = new TreeNode(13);

		System.out.println(convertBST(t1));
	}

}
