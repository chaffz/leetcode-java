package cn.isnap.leetcode.util;

import cn.isnap.leetcode.ListNode;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;

public class ArrayInput {
    public static int[][] as2DArray(String in) {
        List<int[]> data = JSON.parseObject(in, new TypeReference<List<int[]>>(){});
        return data.toArray(new int[data.size()][]);
    }

    public static int[] asArray(String in) {
        List<Integer> data = JSON.parseObject(in, new TypeReference<List<Integer>>() {
        });
        return data.stream().mapToInt(Integer::intValue).toArray();
    }

    public static String[] asStringArray(String in) {
        List<String> data = JSON.parseObject(in, new TypeReference<List<String>>() {
        });
        return data.toArray(new String[0]);
    }

    public static ListNode asListNode(String in) {
        List<Integer> data = JSON.parseObject(in, new TypeReference<List<Integer>>() {
        });
        ListNode dummy = new ListNode();
        if (data == null)
            return dummy.next;

        ListNode cur = dummy;
        for (Integer datum : data) {
            cur.next = new ListNode(datum);
            cur = cur.next;
        }
        return dummy.next;
    }
}
