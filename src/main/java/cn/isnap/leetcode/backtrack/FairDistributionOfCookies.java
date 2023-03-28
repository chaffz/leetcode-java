package cn.isnap.leetcode.backtrack;

public class FairDistributionOfCookies {
  public int distributeCookies(int[] cookies, int k) {
    int[] totals = new int[k];
    return distributeCookies(cookies, k, totals, 0);
  }

  private int distributeCookies(int[] cookies, int k, int[] totals, int index) {
    if (index >= cookies.length) {
      int max = Integer.MIN_VALUE;
      for (final int total : totals) {
        if (max < total) {
          max = total;
        }
      }
      return max;
    }

    int ret = Integer.MAX_VALUE;
    for (int j = 0; j < k; j++) {
      totals[j] += cookies[index];
      ret = Math.min(ret, distributeCookies(cookies, k, totals, index + 1));
      totals[j] -= cookies[index];
    }

    return ret;
  }
}
