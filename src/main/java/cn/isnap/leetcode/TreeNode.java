package cn.isnap.leetcode;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
Definition for a binary tree node.
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {}
    public TreeNode(int val) { this.val = val; }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.val).append(",");
        if (this.left != null)
            sb.append(this.left.toString());

        if (this.right != null)
            sb.append(this.right.toString());

        return sb.toString();
    }

    public String levelString() {
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(this);
        queue.add(null);

        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (cur == null) {
                if (!queue.isEmpty()) {
                    queue.add(null);
                }
            } else {
                if (cur.left != null) {
                    queue.add(cur.left);
                }

                if (cur.right != null) {
                    queue.add(cur.right);
                }

                sb.append(cur.val).append(",");
            }
        }

        return sb.toString();
    }
}
