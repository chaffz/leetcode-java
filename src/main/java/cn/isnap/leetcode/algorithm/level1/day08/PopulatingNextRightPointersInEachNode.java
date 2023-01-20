package cn.isnap.leetcode.algorithm.level1.day08;

import java.util.HashMap;
import java.util.Map;

public class PopulatingNextRightPointersInEachNode {
    public static class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    }

    public Node connect(Node root) {
        Map<Integer, Node> tail = new HashMap<>();
        connect(root, tail, 0);
        return root;
    }

    private void connect(Node node, Map<Integer, Node> tail, int level) {
        if (node == null) return;

        Node t = tail.getOrDefault(level, new Node());
        t.next = node;
        tail.put(level, node);
        connect(node.left, tail, level + 1);
        connect(node.right, tail, level + 1);
    }
}
