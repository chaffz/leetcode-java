package cn.isnap.leetcode.backtrack;

import java.util.*;

public class MaximumRowsCoveredByColumns {
    int result;
    public int maximumRows(int[][] mat, int cols) {
        int m = mat.length; // number of rows
        int n = mat[0].length; // number of columns
        result = -1;

        // if cols is equal to number of columns andswer will be number of rows.
        if(cols == n) return m;

        // Map to store which column index covers which all rows having value 1.
        Map<Integer, Set<Integer>> columnIndexToRowHavingOnes = new HashMap<>();

        for(int i = 0; i < n; i++) columnIndexToRowHavingOnes.put(i, new HashSet<>());
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(mat[i][j] == 1) {
                    Set<Integer> set = columnIndexToRowHavingOnes.get(j);
                    set.add(i);
                    columnIndexToRowHavingOnes.put(j, set);
                }
            }
        }

        getAnswer(0, new ArrayList<Integer>(), cols, columnIndexToRowHavingOnes, m, n);

        return result;
    }

    // Backtracking function
    private void getAnswer(int index, ArrayList<Integer> colChoosen, int cols, Map<Integer, Set<Integer>> columnIndexToRowHavingOnes, int m, int n){

        // If we have chossed cols number of columns
        if(colChoosen.size() == cols){
            Set<Integer> rowNotCoveredByChoosenColumns = new HashSet<>();
            // For each column
            for(int i = 0; i < n; i++){
                // find which all rows were missed which have value 1
                if(!colChoosen.contains(i)){
                    rowNotCoveredByChoosenColumns.addAll(columnIndexToRowHavingOnes.get(i));
                }
            }

            result = Math.max(result, m - rowNotCoveredByChoosenColumns.size());
            return;
        }

        if(index == n) return;

        // pick the column
        colChoosen.add(index);
        getAnswer(index + 1, colChoosen, cols, columnIndexToRowHavingOnes, m, n);

        // unpick the column
        colChoosen.remove(colChoosen.size() - 1);
        getAnswer(index + 1, colChoosen, cols, columnIndexToRowHavingOnes, m, n);

    }

}
