package com.simon;

/**
 * two arrays, A and B, both sorted, A is as twice long as B,
 * first half of A has valid integers, and second half is empty
 * (filled with 0).
 * <p>
 * merge array B into A so that the resulting array is still sorted
 * <p>
 * the merging must be done "in-place", no additional memory should
 * be allocated
 * <p>
 * for example, A = {1, 3, 4, 7, 0, 0, 0, 0}, B = {2, 5, 9, 11},
 * result = {1, 2, 3, 4, 5, 7, 9, 11}
 * <p>
 * Created by wen55527 on 11/15/16.
 */
public class InPlaceMergeSortedArrays {

    public static int[] merge(int[] a, int[] b) {
        int bIndex = b.length - 1;
        int aIndex = b.length - 1;
        int tail = a.length - 1;
        while (bIndex >= 0) {
            if (a[aIndex] > b[bIndex]) {
                a[tail] = a[aIndex];
                aIndex--;
            } else {
                a[tail] = b[bIndex];
                bIndex--;
            }
            tail--;
        }
        return a;
    }

}
