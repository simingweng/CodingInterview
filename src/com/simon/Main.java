package com.simon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        Logger.getLogger(GCD.class.getName()).info("greatest common divisor of " + a + " and " + b + " is " + GCD.gcd(a, b));
        Map<SparseMatrix.Coordinate, Integer> matrixA = new HashMap<>();
        Map<SparseMatrix.Coordinate, Integer> matrixB = new HashMap<>();

        /**
         * sparse matrix
         *
         * A = {
         *      [1, 0, 0, 0, 0],
         *      [0, 1, 0, 0, 0],
         *      [0, 0, 1, 0, 0],
         *      [0, 0, 0, 1, 0],
         *      [0, 0, 0, 0, 1]
         *      }
         * B = {
         *      [0, 0, 0, 0, 1],
         *      [0, 0, 0, 1, 0],
         *      [0, 0, 1, 0, 0],
         *      [0, 1, 0, 0, 0],
         *      [1, 0, 0, 0, 0]
         *      }
         */
        matrixA.put(new SparseMatrix.Coordinate(0, 0), 1);
        matrixA.put(new SparseMatrix.Coordinate(1, 1), 1);
        matrixA.put(new SparseMatrix.Coordinate(2, 2), 1);
        matrixA.put(new SparseMatrix.Coordinate(3, 3), 1);
        matrixA.put(new SparseMatrix.Coordinate(4, 4), 1);
        matrixB.put(new SparseMatrix.Coordinate(4, 0), 1);
        matrixB.put(new SparseMatrix.Coordinate(3, 1), 1);
        matrixB.put(new SparseMatrix.Coordinate(2, 2), 1);
        matrixB.put(new SparseMatrix.Coordinate(1, 3), 1);
        matrixB.put(new SparseMatrix.Coordinate(0, 4), 1);
        Logger.getLogger(SparseMatrix.class.getName()).info("dot product of 2 sparse matrix is " + SparseMatrix.dotProduct(matrixA, matrixB));

        int[] data = {-9, -8, -5, -1, 2, 5};
        Logger.getLogger(SqureSortedValue.class.getName()).info("origin sorted int array: " + Arrays.toString(data));
        Logger.getLogger(SqureSortedValue.class.getName()).info("result sorted square value array: " + Arrays.toString(SqureSortedValue.sort(data)));

        int[][] intervals = {{1, 4}, {6, 8}, {2, 4}, {7, 9}, {10, 15}};
        Logger.getLogger(TVTimeSpan.class.getName()).info("total on time of the TV is " + TVTimeSpan.calculate(intervals) + " hours");

        int[] array = {0, 1, 0, 3, 12};
        Logger.getLogger(MoveZeros.class.getName()).info("input array is " + Arrays.toString(array));
        Logger.getLogger(MoveZeros.class.getName()).info("output array is " + Arrays.toString(MoveZeros.moveZeros(array)));

        int[][] ma = {{1, 0, 0}, {-1, 0, 3}};
        int[][] mb = {{7, 0, 0}, {0, 0, 0}, {0, 0, 1}};
        Logger.getLogger(MoveZeros.class.getName()).info("multiplication of the two matrices is " + printMatrix(MultiplyMatrics.multiply(ma, mb)));
    }

    private static String printMatrix(int[][] matrix){
        String result = "";
        for(int[] row:matrix){
            result+= Arrays.toString(row);
        }
        return result;
    }
}
