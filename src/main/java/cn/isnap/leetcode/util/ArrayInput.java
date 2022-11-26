package cn.isnap.leetcode.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;

public class ArrayInput {
    public static int[][] as2DArray(String in) {
        List<int[]> data = JSON.parseObject(in, new TypeReference<List<int[]>>(){});
        return data.toArray(new int[data.size()][]);
    }

    public static int[] asArray(String in) {
        List<Integer> data = JSON.parseObject(in, new TypeReference<List<Integer>>(){});
        return data.stream().mapToInt(Integer::intValue).toArray();
    }
}