package com.simon;

import java.util.HashMap;
import java.util.Map;

/**
 * find the maximum length of a sub array whose sum equals a specified value
 * <p>
 * Created by wen55527 on 1/12/17.
 */
class SubArraySum {

    static int find(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLengthOfSubArray = -1;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - target)) {
                maxLengthOfSubArray = Math.max(maxLengthOfSubArray, i - map.get(sum - target));
            }
        }
        return maxLengthOfSubArray;
    }

}
