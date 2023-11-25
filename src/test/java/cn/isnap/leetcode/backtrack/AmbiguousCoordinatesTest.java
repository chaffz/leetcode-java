package cn.isnap.leetcode.backtrack;

import com.alibaba.fastjson.JSON;

import org.junit.Assert;
import org.junit.Test;

public class AmbiguousCoordinatesTest {
  AmbiguousCoordinates ambiguousCoordinates = new AmbiguousCoordinates();

  @Test
  public void ambiguousCoordinates() {
    Assert.assertEquals(
        JSON.toJSONString(ambiguousCoordinates.ambiguousCoordinates("(123)")),
        "[\"(1, 23)\",\"(1, 2.3)\",\"(12, 3)\",\"(1.2, 3)\"]");

    Assert.assertEquals(
        JSON.toJSONString(ambiguousCoordinates.ambiguousCoordinates("(0123)").toString()),
        "[\"(0, 1.23)\",\"(0, 12.3)\",\"(0, 123)\",\"(0.1, 2.3)\",\"(0.1, 23)\",\"(0.12, 3)\"]"
    );
  }
}