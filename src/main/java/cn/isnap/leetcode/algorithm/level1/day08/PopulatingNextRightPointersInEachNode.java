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
        if (root == null) return null;
        if (root.left != null) root.left.next = root.right;
        if (root.right != null) root.right.next = root.next != null ? root.next.left : null;
        connect(root.left);
        connect(root.right);

        return root;
    }
}
