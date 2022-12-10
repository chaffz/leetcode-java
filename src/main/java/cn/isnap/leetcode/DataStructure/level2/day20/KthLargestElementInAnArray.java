package cn.isnap.leetcode.DataStructure.level2.day20;

import java.util.*;

public class KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int num : nums) {
            heap.add(num);
        }

        while (k > 1) {
            heap.poll();
            k --;
        }

        return heap.peek();
    }
}
