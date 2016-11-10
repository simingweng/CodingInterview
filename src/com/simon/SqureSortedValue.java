package com.simon;

/**
 * Created by wen55527 on 11/9/16.
 */
public class SqureSortedValue {

    public static int[] sort(int[] data) {
        if (data == null) {
            return data;
        }
        int left = 0;
        int right = data.length - 1;
        int index = right;
        int[] result = new int[data.length];
        while (left <= right) {
            if (Math.abs(data[left]) > Math.abs(data[right])) {
                result[index] = (int) Math.pow(data[left], 2);
                left++;
            } else {
                result[index] = (int) Math.pow(data[right], 2);
                right--;
            }
            index--;
        }
        return result;
    }

}
