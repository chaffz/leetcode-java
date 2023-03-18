package cn.isnap.leetcode.backtrack;

public class ConstructSmallestNumberFromDIString {
    public String smallestNumber(String pattern) {
        boolean[] visited = new boolean[10];
        String result = null;
        for (int i = 1; i < 10; i++) {
            StringBuilder builder = new StringBuilder();
            visited[i] = true;
            if (smallestNumber(builder, visited, pattern, i, 0)) {
                result = builder.toString();
                break;
            }
            visited[i] = false;
        }

        return result;
    }

    private boolean smallestNumber(StringBuilder builder, boolean[] visited, String pattern, int last, int index) {
        builder.append(last);
        if (index >= pattern.length()) return true;
        boolean incr = pattern.charAt(index) == 'I';
        int lo, hi;
        if (incr) {
            lo = last + 1;
            hi = 9;
        } else {
            lo = 1;
            hi = last - 1;
        }
        for (int i = lo; i <= hi; i++) {
            if (visited[i]) continue;
            visited[i] = true;
            if (smallestNumber(builder, visited, pattern, i, index+1)) return true;
            visited[i] = false;
        }
        builder.setLength(builder.length() - 1);
        return false;
    }
}
