/**
 *
 */
package com.Amazon.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author dhirajborade
 *
 */
public class WordLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beginWord = "hit";
		String endWord = "cog";
		List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
		System.out.println(ladderLength(beginWord, endWord, wordList));

	}

	private static int ladderLength(String beginWord, String endWord, List<String> wordList) {
		if (beginWord == null || endWord == null || beginWord.length() != endWord.length())
			return 0;
		HashSet<String> wordSet = new HashSet<>(wordList);
		if (!wordSet.contains(endWord))
			return 0;
		Queue<String> queue = new LinkedList<>(); // For BFS.
		int step = 1;
		queue.add(beginWord);
		while (!queue.isEmpty()) {
			int n = queue.size();
			for (int i = 0; i < n; i++) {
				String curr = queue.poll();
				for (int j = 0; j < curr.length(); j++) {
					for (char c = 'a'; c <= 'z'; c++) {
						StringBuilder sb = new StringBuilder(curr);
						sb.setCharAt(j, c);
						String next = sb.toString();
						if (next.equals(endWord))
							return step + 1;
						if (wordSet.contains(next)) {
							queue.add(next);
							wordSet.remove(next);
						}
					}
				}
			}
			step++;
		}
		return 0;
	}

}
