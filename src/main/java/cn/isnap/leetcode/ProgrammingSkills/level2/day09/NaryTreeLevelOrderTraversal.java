package cn.isnap.leetcode.ProgrammingSkills.level2.day09;

import cn.isnap.leetcode.Node;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new LinkedList<>();
        levelOrder(result, root, 0);
        return result;
    }

    private void levelOrder(List<List<Integer>> result, Node node, int level) {
        if (node == null) return;
        if (result.size() == level) {
            result.add(new ArrayList<>());
        }
        List<Integer> levels = result.get(level);
        levels.add(node.val);
        if (node.children == null) return;
        node.children.forEach(n -> levelOrder(result, n, level + 1));
    }
}
