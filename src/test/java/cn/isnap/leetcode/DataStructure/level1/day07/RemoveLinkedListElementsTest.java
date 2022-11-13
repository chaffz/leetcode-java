package cn.isnap.leetcode.DataStructure.level1.day07;

import cn.isnap.leetcode.ListNode;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveLinkedListElementsTest {

    @Test
    public void removeElements() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(6,
                new ListNode(3, new ListNode(4, new ListNode(5,
                        new ListNode(6, new ListNode(6))))))));
        RemoveLinkedListElements rml = new RemoveLinkedListElements();
        Assert.assertEquals(rml.removeElements(head, 6).toString(), "1,2,3,4,5,");
    }
}