package cn.isnap.leetcode.lc75.level2.day16;

public class Trie {
    static class Node {
        boolean isWord;
        Node[] nodes = new Node[26];
    }

    Node root = new Node();

    public Trie() {

    }

    public void insert(String word) {
        char[] chars = word.toCharArray();
        Node cur = root;
        for (char c : chars) {
            if (cur.nodes[c - 'a'] == null) {
                cur.nodes[c - 'a'] = new Node();
            }
            cur = cur.nodes[c - 'a'];
        }
        cur.isWord = true;
    }

    public Node go(String word) {
        char[] chars = word.toCharArray();
        Node cur = root;
        for (char c : chars) {
            if (cur != null) {
                cur = cur.nodes[c - 'a'];
            }
        }

        return cur;
    }

    public boolean search(String word) {
        Node cur = go(word);
        return (cur != null && cur.isWord);
    }

    public boolean startsWith(String prefix) {
        Node cur = go(prefix);
        return (cur != null);
    }
}
