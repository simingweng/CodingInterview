package com.simon;

import java.util.ArrayList;
import java.util.List;

/**
 * Find and print the characters in a string, which continuously
 * repeat for the most times
 * <p>
 * Created by simingweng on 1/9/17.
 */
class LetterContinuouslyRepeatedMostly {

    static List<Character> find(String s) {
        List<Character> result = new ArrayList<>();
        if (s == null || s.isEmpty()) {
            return result;
        }
        int maxFrequency = 1;
        int counter = 1;
        char previousChar = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            if (s.charAt(i) != previousChar) {
                if (counter == maxFrequency) {
                    result.add(previousChar);
                } else if (counter > maxFrequency) {
                    result.clear();
                    result.add(previousChar);
                    maxFrequency = counter;
                }
                previousChar = s.charAt(i);
                counter = 1;
            } else {
                counter++;
            }
        }
        if (counter == maxFrequency) {
            result.add(previousChar);
        } else if (counter > maxFrequency) {
            result.clear();
            result.add(previousChar);
        }
        return result;
    }

}
