package cn.isnap.leetcode.DataStructure.level2.day17;

import cn.isnap.leetcode.TreeNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @see cn.isnap.leetcode.lc75.level2.day09.BSTIterator
 */
public class BinarySearchTreeIterator {
    TreeNode cur;
    Deque<TreeNode> deque = new LinkedList<>();

    BinarySearchTreeIterator(TreeNode root) {
        cur = root;
    }

    public int next() {
        while (cur != null) {
            deque.push(cur);
            cur = cur.left;
        }

        cur = deque.pop();
        int val = cur.val;
        cur = cur.right;
        return val;
    }

    public boolean hasNext() {
        return cur != null || !deque.isEmpty();
    }
}
