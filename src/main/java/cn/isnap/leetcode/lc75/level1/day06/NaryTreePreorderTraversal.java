package cn.isnap.leetcode.lc75.level1.day06;

import java.util.ArrayList;
import java.util.List;
import cn.isnap.leetcode.Node;

public class NaryTreePreorderTraversal {

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<>();
        preorder(root, result);
        return result;
    }

    private void preorder(Node node, List<Integer> result) {
        if (node == null) return;

        result.add(node.val);
        if (node.children == null) return;

        for (int i = 0; i < node.children.size(); i++) {
            preorder(node.children.get(i), result);
        }
    }
}
