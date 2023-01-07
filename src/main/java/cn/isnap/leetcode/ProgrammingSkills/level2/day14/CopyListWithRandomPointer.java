package cn.isnap.leetcode.ProgrammingSkills.level2.day14;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Map<Node, Node> mapped = new HashMap<>();
        Node node = head;
        while (node != null) {
            mapped.put(node, new Node(node.val));
            node = node.next;
        }
        node = head;
        while (node != null) {
            Node tmp = mapped.get(node);
            tmp.next = mapped.get(node.next);
            tmp.random = mapped.get(node.random);
            node = node.next;
        }

        return mapped.get(head);
    }
}
