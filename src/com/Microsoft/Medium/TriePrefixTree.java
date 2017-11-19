package com.Microsoft.Medium;

class TrieNode {
	public boolean isWord;
	public TrieNode[] children;

	public TrieNode() {
		this.children = new TrieNode[26];
	}
}

public class TriePrefixTree {

	private TrieNode root;

	/** Initialize your data structure here. */
	public TriePrefixTree() {
		root = new TrieNode();
	}

	/** Inserts a word into the trie. */
	private void insert(String word) {
		TrieNode p = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (p.children[c - 'a'] == null) {
				p.children[c - 'a'] = new TrieNode();
			}
			p = p.children[c - 'a'];
		}
		p.isWord = true;
	}

	/** Returns if the word is in the trie. */
	private boolean search(String word) {
		TrieNode p = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			if (p.children[c - 'a'] == null)
				return false;
			p = p.children[c - 'a'];
		}
		return p.isWord;
	}

	/**
	 * Returns if there is any word in the trie that starts with the given prefix.
	 */
	private boolean startsWith(String prefix) {
		TrieNode p = root;
		for (int i = 0; i < prefix.length(); i++) {
			char c = prefix.charAt(i);
			if (p.children[c - 'a'] == null)
				return false;
			p = p.children[c - 'a'];
		}
		return true;

	}

	public static void main(String[] args) {
		TriePrefixTree trieTree = new TriePrefixTree();
		trieTree.insert("dhiraj");
		trieTree.insert("borade");
		trieTree.insert("prajakta");
		trieTree.insert("karandikar");
		System.out.println(trieTree.search("dhiraj"));
		System.out.println(trieTree.search("borade"));
		System.out.println(trieTree.search("raj"));
		System.out.println(trieTree.search("prajakta"));
		System.out.println(trieTree.search("dhiraj"));
		System.out.println(trieTree.search("karandikar"));
		System.out.println(trieTree.startsWith("d"));
		System.out.println(trieTree.startsWith("b"));
		System.out.println(trieTree.startsWith("a"));
		System.out.println(trieTree.startsWith("p"));
		System.out.println(trieTree.startsWith("b"));
		System.out.println(trieTree.startsWith("k"));
	}
}