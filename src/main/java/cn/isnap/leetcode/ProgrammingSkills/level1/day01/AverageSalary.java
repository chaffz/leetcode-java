package cn.isnap.leetcode.ProgrammingSkills.level1.day01;

public class AverageSalary {
    public double average(int[] salary) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double result = 0;
        for (int i : salary) {
            if (i > max) max = i;
            if (i < min) min = i;
            result += i / (double) (salary.length - 2);
        }
        result -= max / (double) (salary.length - 2);
        result -= min / (double) (salary.length - 2);
        return result;
    }
}
