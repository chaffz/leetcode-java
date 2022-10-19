package cn.isnap.leetcode.lc75.level2.day02;

import java.math.BigDecimal;
import java.math.BigInteger;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.length() == 0 || num2.length() == 0) return "0";

        // There will only be this much number of digits for a multiplication
        // Need proof
        int[] result = new int[num1.length() + num2.length()];

        // Accumulate each digit's multiplication result
        // They can be above 10
        for (int i1 = num1.length() - 1; i1 >= 0; i1--){
            int d1 = num1.charAt(i1) - '0';
            for (int i2 = num2. length() - 1; i2 >= 0; i2--){
                int d2 = num2.charAt(i2) - '0';
                result[i1 + i2 + 1] += d2 * d1;
            }
        }

        // Turn each place to under 10, and Accumulate the over 10 part
        // to the next digit
        for(int i = result.length - 1; i >= 1; i--){
            result[i-1] += result[i]/10;
            result[i] = result[i]%10;
        }

        // Turn it into string
        boolean foundFirstNonZero = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < result.length; i++){
            if (foundFirstNonZero){
                sb.append(result[i]);
            }else if(result[i] != 0){
                sb.append(result[i]);
                foundFirstNonZero = true;
            }
        }
        if (!foundFirstNonZero) return "0";
        return sb.toString();
    }
}
