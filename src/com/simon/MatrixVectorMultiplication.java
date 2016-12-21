package com.simon;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wen55527 on 12/21/16.
 */
public class MatrixVectorMultiplication {

    public static int[] multiply(int[][] matrix, int[] vector) {
        int[] result = new int[vector.length];
        List<Integer> nzv = new ArrayList<>();
        List<Integer> rowNzvRange = new ArrayList<>();
        List<Integer> colIndex = new ArrayList<>();
        rowNzvRange.add(0);
        for (int i = 0; i < matrix.length; i++) {
            int count = rowNzvRange.get(i);
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] != 0) {
                    nzv.add(matrix[i][j]);
                    colIndex.add(j);
                    count++;
                }
            }
            rowNzvRange.add(count);
        }

        for (int i = 0; i < vector.length; i++) {
            for (int k = rowNzvRange.get(i); k < rowNzvRange.get(i + 1); k++) {
                result[i] += nzv.get(k) * vector[colIndex.get(k)];
            }
        }
        return result;
    }

}
