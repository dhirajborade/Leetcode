package com.Microsoft.Medium;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeZigZagTraversal {

	private static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		List<List<Integer>> resultList = zigzagLevelOrder(root);
		System.out.println(resultList.toString());
	}

	private static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> myList = new ArrayList<>();
        treeTraversal(root, myList, 0);
        return myList;
    }
    
    private static void treeTraversal(TreeNode root, List<List<Integer>> myList, int treeLevel) {
        if (root == null) {
            return;
        }
        
        if (myList.size() <= treeLevel) {
            List<Integer> levelList = new ArrayList<Integer>();
            myList.add(levelList);
        }
        
        List<Integer> levelCollection = myList.get(treeLevel);
        if (treeLevel % 2 == 0) {
            levelCollection.add(root.val);
        } else {
            levelCollection.add(0, root.val);
        }
        
        treeTraversal(root.left, myList, treeLevel + 1);
        treeTraversal(root.right, myList, treeLevel + 1);
    }

}
