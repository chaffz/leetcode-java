package cn.isnap.leetcode.lc75.level1.day06;

import cn.isnap.leetcode.Node;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class NaryTreePreorderTraversalTest {

    @Test
    public void preorder() {
        Node root = new Node(1);
        root.children.add(new Node(3));
        root.children.add(new Node(2));
        root.children.add(new Node(4));

        root.children.get(0).children.add(new Node(5));
        root.children.get(0).children.add(new Node(6));

        NaryTreePreorderTraversal ntp = new NaryTreePreorderTraversal();
        List<Integer> result = ntp.preorder(root);
        StringBuilder sb = new StringBuilder();
        for (Integer val : result) {
            sb.append(val).append(",");
        }

        Assert.assertEquals(sb.toString(), "1,3,5,6,2,4,");
    }
}