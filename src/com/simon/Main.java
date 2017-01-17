package com.simon;

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

        int[][] matrix = {{1, 0, 0}, {-1, 0, 3}, {0, 1, 0}};
        int[] vector = {1, 2, 0};
        Logger.getLogger(MatrixVectorMultiplication.class.getName()).info("multiplication of the two matrices is " + Arrays.toString(MatrixVectorMultiplication.multiply(matrix, vector)));

        int[] aa = {1, 3, 4, 7, 0, 0, 0, 0};
        int[] bb = {2, 5, 9, 11};
        Logger.getLogger(InPlaceMergeSortedArrays.class.getName()).info("merge result is " + Arrays.toString(InPlaceMergeSortedArrays.merge(aa, bb)));

        String stringWithRepeatingLetters = "aa a bb c cc ddd";
        Logger.getLogger(LetterContinuouslyRepeatedMostly.class.getName()).info("letters continuously repeating for the most are " + LetterContinuouslyRepeatedMostly.find(stringWithRepeatingLetters));

        String toBeReversed = "dog bites man";
        Logger.getLogger(ReverseWords.class.getName()).info(toBeReversed + " reversed to " + ReverseWords.reverse(toBeReversed));

        Logger.getLogger(PalindromeSentence.class.getName()).info("Was it a car or a cat I saw? is" + (PalindromeSentence.verify("Was it a car or a cat I saw?") ? "" : " not") + " a palindrome");

        int[] j = {-1, 1, 1, 5, -2, 3};
        int k = 5;
        Logger.getLogger(SubArraySum.class.getName()).info("{-1, 1, 1, 5, -2, 3} max length of sub array whose sum is 5 is " + SubArraySum.find(j, k));
    }

    private static String printMatrix(int[][] matrix) {
        String result = "";
        for (int[] row : matrix) {
            result += Arrays.toString(row);
        }
        return result;
    }
}
