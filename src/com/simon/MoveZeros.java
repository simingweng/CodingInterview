package com.simon;

/**
 * Created by wen55527 on 11/10/16.
 */
public class MoveZeros {

    public static int[] moveZeros(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            if (array[left] == 0) {
                for (int i = left; i < right; i++) {
                    array[i] = array[i + 1];
                }
                array[right] = 0;
                right--;
            } else {
                left++;
            }
        }
        return array;
    }

}
