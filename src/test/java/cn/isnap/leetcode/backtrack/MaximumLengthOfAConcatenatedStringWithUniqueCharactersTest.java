package cn.isnap.leetcode.backtrack;

import cn.isnap.leetcode.util.ArrayInput;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class MaximumLengthOfAConcatenatedStringWithUniqueCharactersTest {
  MaximumLengthOfAConcatenatedStringWithUniqueCharacters uniqueCharacters
      = new MaximumLengthOfAConcatenatedStringWithUniqueCharacters();

  @Test
  public void maxLength() {
    List<String> arr = Arrays.stream(ArrayInput.asStringArray("[\"cha\",\"r\",\"act\",\"ers\"]")).collect(Collectors.toList());
//    Assert.assertEquals(uniqueCharacters.maxLength(arr), 6);

    arr = Arrays.stream(ArrayInput.asStringArray("[\"aa\",\"bb\"]")).collect(Collectors.toList());
    Assert.assertEquals(uniqueCharacters.maxLength(arr), 0);
  }
}