package cn.isnap.leetcode.DataStructure.level1.day09;

import java.util.Stack;

/**
 * @see cn.isnap.leetcode.lc75.level2.day16.MyQueue
 */
public class ImplementQueueUsingStacks {
    Stack<Integer> push = new Stack<>();
    Stack<Integer> pop = new Stack<>();

    public ImplementQueueUsingStacks() {}

    public void push(int x) {
        while (!empty()) {
            push.push(pop.pop());
        }
        push.push(x);
        while (!push.isEmpty()) {
            pop.push(push.pop());
        }
    }

    public int pop() {
        if (!empty())
            return pop.pop();
        return 0;
    }

    public int peek() {
        if (!empty())
            return pop.peek();
        return 0;
    }

    public boolean empty() {
        return pop.isEmpty();
    }
}
