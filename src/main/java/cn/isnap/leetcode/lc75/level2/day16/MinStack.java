package cn.isnap.leetcode.lc75.level2.day16;

import java.util.ArrayList;
import java.util.List;

public class MinStack {
    static class Node {
        int val;
        int min;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }
    List<Node> stack = new ArrayList<>();

    public MinStack() {

    }

    public void push(int val) {
        int min = getMin();
        stack.add(new Node(val, Math.min(min, val)));
    }

    public void pop() {
        if (!stack.isEmpty())
            stack.remove(stack.size() - 1);
    }

    public int top() {
        if (!stack.isEmpty())
            return stack.get(stack.size()-1).val;

        return Integer.MAX_VALUE;
    }

    public int getMin() {
        if (!stack.isEmpty())
            return stack.get(stack.size()-1).min;
        return Integer.MAX_VALUE;
    }
}
