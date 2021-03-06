/**
 *
 */
package com.Amazon.Medium;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author dhirajborade
 *
 */
public class SerializeDeserializeBST {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	private static final String SEP = ",";
	private static final String NULL = "null";

	/**
	 *
	 */
	public SerializeDeserializeBST() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.right.right = new TreeNode(7);
		String serializedTree = serialize(root);
		System.out.println(serializedTree);
		deserialize(serializedTree);
	}

	private static String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if (root == null)
			return NULL;
		Stack<TreeNode> st = new Stack<>();
		st.push(root);
		while (!st.empty()) {
			root = st.pop();
			sb.append(root.val).append(SEP);
			if (root.right != null)
				st.push(root.right);
			if (root.left != null)
				st.push(root.left);
		}
		return sb.toString();
	}

	private static TreeNode deserialize(String data) {
		if (data.equals(NULL))
			return null;
		String[] strs = data.split(SEP);
		Queue<Integer> q = new LinkedList<>();
		for (String e : strs) {
			q.offer(Integer.parseInt(e));
		}
		return getNode(q);
	}

	private static TreeNode getNode(Queue<Integer> q) { // q: 5,3,2,6,7
		if (q.isEmpty())
			return null;
		TreeNode root = new TreeNode(q.poll());// root (5)
		Queue<Integer> samllerQueue = new LinkedList<>();
		while (!q.isEmpty() && q.peek() < root.val) {
			samllerQueue.offer(q.poll());
		}
		// smallerQueue : 3,2 storing elements smaller than 5 (root)
		root.left = getNode(samllerQueue);
		// q: 6,7 storing elements bigger than 5 (root)
		root.right = getNode(q);
		return root;
	}

}
