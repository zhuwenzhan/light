package com.geek.algorithm.light.Algorithm.base;

public class Trie {
    private boolean isEnd;
    private Trie[] next;

    /**Initialize your data structure here**/
    public Trie() {
        isEnd = false;
        next = new Trie[26];
    }

    /**Insert a word into the trie**/
    public void insert (String word) {
        if (word == null || word.length() == 0) return;
        char[] words = word.toCharArray();
        Trie curr = this;
        for (char c : words) {
            int n = c - 'a';
            if (curr.next[n] == null) curr.next[n] = new Trie();
            curr = curr.next[n];
        }
        curr.isEnd = true;
    }

    private Trie searchPrefix (String word) {
        char[] words = word.toCharArray();
        Trie curr = this;
        for (char c : words) {
            int n = c - 'a';
            curr = curr.next[n];
            if(curr == null) return curr;
        }
        return curr;
    }
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        Trie node = searchPrefix(word);
        if (node != null && node.isEnd == true) {
            return true;
        }
        return false;
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        Trie node = searchPrefix(prefix);
        if (node != null ) {
            return true;
        }
        return false;
    }


}
