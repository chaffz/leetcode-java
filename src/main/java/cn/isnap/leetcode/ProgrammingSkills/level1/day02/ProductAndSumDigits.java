package cn.isnap.leetcode.ProgrammingSkills.level1.day02;

// 1281. Subtract the Product and Sum of Digits of an Integer
public class ProductAndSumDigits {
    public int subtractProductAndSum(int n) {
        int multi = 1, sum = 0, t = 0;
        while (n > 0) {
            t = n % 10;
            n /= 10;
            multi *= t;
            sum += t;
        }

        return multi - sum;
    }
}
