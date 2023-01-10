package cn.isnap.leetcode.ProgrammingSkills.level2.day18;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NestedIterator implements Iterator<Integer> {
    public interface NestedInteger {
        // @return true if this NestedInteger holds a single integer, rather than a nested list.
        public boolean isInteger();

        // @return the single integer that this NestedInteger holds, if it holds a single integer
        // Return null if this NestedInteger holds a nested list
        public Integer getInteger();

        // @return the nested list that this NestedInteger holds, if it holds a nested list
        // Return empty list if this NestedInteger holds a single integer
        public List<NestedInteger> getList();
    }

    Queue<Integer> nested = new LinkedList<>();

    public NestedIterator(List<NestedInteger> nestedList) {
        init(nestedList);
    }

    private void init(List<NestedInteger> nestedList) {
        for (NestedInteger nestedInteger : nestedList) {
            if (nestedInteger.isInteger()) {
                nested.offer(nestedInteger.getInteger());
            } else {
                init(nestedInteger.getList());
            }
        }
    }

    @Override
    public Integer next() {
        return nested.poll();
    }

    @Override
    public boolean hasNext() {
        return !nested.isEmpty();
    }
}
