package cn.isnap.leetcode.backtrack;

import java.util.LinkedList;
import java.util.List;

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new LinkedList<>();
        List<String> cur = new LinkedList<>();
        restoreIpAddresses(result, cur, s, 0);

        return result;
    }

    private void restoreIpAddresses(List<String> result, List<String> cur, String s, int start) {
        if (s.length() <= start) {
            if (cur.size() == 4) result.add(String.join(".", cur));
            return;
        }
        for (int i = 1; i <= 3; i++) {
            int next = start + i;
            if (s.length() < next) break;
            String sub = s.substring(start, next);
            if (!isValidSection(sub)) continue;
            cur.add(sub);
            restoreIpAddresses(result, cur, s, next);
            cur.remove(cur.size() - 1);
        }
    }

    private boolean isValidSection(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') return false;
        return Integer.parseInt(s) < 256;
    }
}
