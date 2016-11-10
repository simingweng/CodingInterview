package com.simon;

/**
 * Created by wen55527 on 11/9/16.
 */
public class TVTimeSpan {

    public static int calculate(int[][] intervals) {
        int[] fullday = new int[24];
        for (int[] interval : intervals) {
            for (int i = interval[0]; i <= interval[1] - 1; i++) {
                fullday[i]=1;
            }
        }
        int timespan = 0;
        for (int i : fullday) {
            if (i > 0) {
                timespan++;
            }
        }
        return timespan;
    }

}
