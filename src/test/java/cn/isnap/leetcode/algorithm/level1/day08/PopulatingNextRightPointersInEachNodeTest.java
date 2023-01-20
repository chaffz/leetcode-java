package cn.isnap.leetcode.algorithm.level1.day08;

import org.junit.Test;

import static org.junit.Assert.*;

public class PopulatingNextRightPointersInEachNodeTest {
    PopulatingNextRightPointersInEachNode pointersInEachNode = new PopulatingNextRightPointersInEachNode();

    @Test
    public void connect() {
        // [1,2,3,4,5,6,7]

        PopulatingNextRightPointersInEachNode.Node root = new PopulatingNextRightPointersInEachNode.Node(
                1,
                new PopulatingNextRightPointersInEachNode.Node(2,
                        new PopulatingNextRightPointersInEachNode.Node(4),
                        new PopulatingNextRightPointersInEachNode.Node(5),
                        null),
                new PopulatingNextRightPointersInEachNode.Node(3,
                        new PopulatingNextRightPointersInEachNode.Node(6),
                        new PopulatingNextRightPointersInEachNode.Node(7),
                        null),
                null
        );
        pointersInEachNode.connect(root);
    }
}