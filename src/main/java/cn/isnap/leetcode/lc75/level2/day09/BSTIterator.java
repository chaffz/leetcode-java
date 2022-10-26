package cn.isnap.leetcode.lc75.level2.day09;

import cn.isnap.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BSTIterator {
    private List<Integer> inOrderList;
    private Integer index;

    public BSTIterator(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrderArray(result, root);
        this.inOrderList = result;
        this.index = 0;
    }

    public int next() {
        int nextVal = -1;
        if (this.index < this.inOrderList.size()) {
            nextVal = this.inOrderList.get(index);
            this.index++;
        }
        return nextVal;
    }

    public boolean hasNext() {
        return this.index < this.inOrderList.size();
    }

    private void inOrderArray(List<Integer> result, TreeNode root) {
        if (root == null) return;

        inOrderArray(result, root.left);
        result.add(root.val);
        inOrderArray(result, root.right);
    }
}
