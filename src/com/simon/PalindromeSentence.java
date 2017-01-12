package com.simon;

/**
 * verify whether a sentence is a palindrome
 * https://en.wikipedia.org/wiki/Palindrome
 * <p>
 * Created by wen55527 on 1/12/17.
 */
class PalindromeSentence {
    static boolean verify(String sentence) {
        if (sentence == null) {
            return false;
        }
        int left = 0, right = sentence.length() - 1;
        while (left < right) {
            while (!isAlphabet(sentence.charAt(left))) {
                left++;
            }
            while (!isAlphabet(sentence.charAt(right))) {
                right--;
            }
            if (sentence.charAt(left) != sentence.charAt(right) && Math.abs(sentence.charAt(left) - sentence.charAt(right)) != 32) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    private static boolean isAlphabet(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }
}
