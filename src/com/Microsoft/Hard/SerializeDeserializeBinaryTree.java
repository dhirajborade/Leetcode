package com.Microsoft.Hard;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SerializeDeserializeBinaryTree {

	
	private static final String NN = "X";

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
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5);
		String serializedTree = serialize(root);
		System.out.println(serializedTree);
		deserialize(serializedTree);
	}

	// Encodes a tree to a single string.
	private static String serialize(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		buildString(root, sb);
		return sb.toString();
	}

	private static void buildString(TreeNode root, StringBuilder sb) {
		if (root == null) {
			sb.append(NN + " ");
		} else {
			sb.append(root.val + " ");
			buildString(root.left, sb);
			buildString(root.right, sb);
		}
	}

	// Decodes your encoded data to tree.
	private static TreeNode deserialize(String data) {
		Deque<String> nodes = new LinkedList<>();
		nodes.addAll(Arrays.asList(data.split(" ")));
		return buildTree(nodes);
	}

	private static TreeNode buildTree(Deque<String> nodes) {
		String val = nodes.remove();
		if (val.equals(NN)) {
			return null;
		} else {
			TreeNode node = new TreeNode(Integer.valueOf(val));
			node.left = buildTree(nodes);
			node.right = buildTree(nodes);
			return node;
		}
	}

}
