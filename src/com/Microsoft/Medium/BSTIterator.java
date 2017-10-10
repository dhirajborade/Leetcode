package com.Microsoft.Medium;

import java.util.Stack;

public class BSTIterator {
	
	private static Stack<TreeNode> treeStack;

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public BSTIterator(TreeNode root) {
		treeStack = new Stack<>();
		TreeNode currentNode = root;
		while (currentNode != null) {
			treeStack.push(currentNode);
			if (currentNode.left !=  null) {
				currentNode = currentNode.left;
			} else {
				break;
			}
		}
	}

	/** @return whether we have a next smallest number */
	public boolean hasNext() {
		return !treeStack.isEmpty();
	}

	/** @return the next smallest number */
	public int next() {
		TreeNode node = treeStack.pop();
		TreeNode currentNode = node;
		if (currentNode.right != null) {
			currentNode = currentNode.right;
			while (currentNode != null) {
				treeStack.push(currentNode);
				if (currentNode.left != null) {
					currentNode = currentNode.left;
				} else {
					break;
				}
			}
			
		}
		return node.val;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(2);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(4);
		root.left.right.left = new TreeNode(3);
		root.right.right = new TreeNode(7);
		BSTIterator i = new BSTIterator(root);
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
}

/**
 * Your BSTIterator will be called like this: BSTIterator i = new
 * BSTIterator(root); while (i.hasNext()) v[f()] = i.next();
 */