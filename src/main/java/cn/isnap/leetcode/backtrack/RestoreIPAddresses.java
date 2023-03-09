package cn.isnap.leetcode.backtrack;

import java.util.LinkedList;
import java.util.List;

public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new LinkedList<>();
        List<String> cur = new LinkedList<>();
        restoreIpAddresses(result, cur, s);

        return result;
    }

    private void restoreIpAddresses(List<String> result, List<String> cur, String s) {
        if (s.length() == 0) {
            if (cur.size() == 4) result.add(String.join(".", cur));
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (s.length() < i) break;
            String sub = s.substring(0, i);
            if (!isValidSection(sub)) continue;
            cur.add(sub);
            restoreIpAddresses(result, cur, s.substring(i));
            cur.remove(cur.size() - 1);
        }
    }

    private boolean isValidSection(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') return false;
        return Integer.parseInt(s) < 256;
    }
}
