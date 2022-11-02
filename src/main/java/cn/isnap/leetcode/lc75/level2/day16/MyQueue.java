package cn.isnap.leetcode.lc75.level2.day16;

import java.util.Stack;

class MyQueue {
    Stack<Integer> push = new Stack<>();
    Stack<Integer> pop = new Stack<>();

    public MyQueue() {}

    public void push(int x) {
        while (!pop.isEmpty()) {
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
