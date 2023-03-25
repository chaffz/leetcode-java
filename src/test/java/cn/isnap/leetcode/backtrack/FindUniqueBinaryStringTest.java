package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FindUniqueBinaryStringTest {
  FindUniqueBinaryString findUniqueBinaryString = new FindUniqueBinaryString();

  @Test
  public void findDifferentBinaryString() {
    // ["111","011","001"]
    Assert.assertEquals(findUniqueBinaryString.findDifferentBinaryString(
        ArrayInput.asStringArray("[\"111\",\"011\",\"001\"]")), "000");
    Assert.assertEquals(findUniqueBinaryString.findDifferentBinaryString(
        ArrayInput.asStringArray("[\"00\",\"01\"]")), "10");
  }
}