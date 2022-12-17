package cn.isnap.leetcode.ProgrammingSkills.level1.day05;

import java.math.BigDecimal;
import java.math.MathContext;

public class CheckIfItIsAStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        BigDecimal slope = getSlope(coordinates[0], coordinates[1]);
        for (int i = 1; i < coordinates.length; i++) {
            BigDecimal currentSlope = getSlope(coordinates[0], coordinates[i]);
            if (currentSlope.compareTo(slope) != 0) return false;
            currentSlope = getSlope(coordinates[i-1], coordinates[i]);
            if (currentSlope.compareTo(slope) != 0) return false;
        }
        return true;
    }

    private BigDecimal getSlope(int[] point1, int[] point2) {
        BigDecimal divided = new BigDecimal(point2[0] - point1[0]);
        if (divided.compareTo(new BigDecimal(0)) == 0) return divided;
        return new BigDecimal(point2[1] - point1[1]).divide(divided, MathContext.DECIMAL128);
    }
}
