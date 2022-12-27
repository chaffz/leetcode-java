package cn.isnap.leetcode.ProgrammingSkills.level2.day04;

import cn.isnap.leetcode.ListNode;
import cn.isnap.leetcode.TreeNode;

public class LinkedListInBinaryTree {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null) return false;
        return equal(head, root) || isSubPath(head, root.left) || isSubPath(head, root.right);
    }

    public boolean equal(ListNode head, TreeNode root) {
        if (head == null) return true;
        if (root == null) return false;
        return root.val == head.val && (equal(head.next, root.left) || equal(head.next, root.right));
    }
}
