package cn.isnap.leetcode.DataStructure.level2.day11;

import cn.isnap.leetcode.ListNode;
import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class IntersectionOfTwoLinkedListsTest {
    IntersectionOfTwoLinkedLists intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();

    @Test
    public void getIntersectionNode() {
        ListNode c = new ListNode(3, new ListNode(4, new ListNode(5)));
        ListNode a = new ListNode(10, new ListNode(9, c));
        ListNode b = new ListNode(8, new ListNode(7, new ListNode(6, c)));
        ListNode r;
        r = intersectionOfTwoLinkedLists.getIntersectionNode(a, b);
        Assert.assertNotNull(r);
        Assert.assertEquals(r.val, 3);

        //[1,9,1,2,4]
        //[3,2,4]
        a = ArrayInput.asListNode("[1,9,1,2,4]");
        b = ArrayInput.asListNode("[3,2,4]");
        b.next = a.next.next.next;
        r = intersectionOfTwoLinkedLists.getIntersectionNode(a, b);
        Assert.assertNotNull(r);
        Assert.assertEquals(r.val, 2);
    }
}