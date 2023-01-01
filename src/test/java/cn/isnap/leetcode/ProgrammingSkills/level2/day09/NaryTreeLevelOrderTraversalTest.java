package cn.isnap.leetcode.ProgrammingSkills.level2.day09;

import cn.isnap.leetcode.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class NaryTreeLevelOrderTraversalTest {
    NaryTreeLevelOrderTraversal naryTreeLevelOrderTraversal = new NaryTreeLevelOrderTraversal();

    @Test
    public void levelOrder() {
        Node node = new Node(1);
        node.children = new LinkedList<>();
        node.children.add(new Node(3));
        node.children.add(new Node(2));
        node.children.add(new Node(4));
        node.children.get(0).children = new LinkedList<>();
        node.children.get(0).children.add(new Node(5));
        node.children.get(0).children.add(new Node(6));
        Assert.assertEquals(naryTreeLevelOrderTraversal.levelOrder(node).toString(),
                "[[1], [3, 2, 4], [5, 6]]");
    }
}