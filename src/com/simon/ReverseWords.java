package com.simon;

/**
 * reverse the words in a sentence in a memory-friendly approach
 * <p>
 * Created by wen55527 on 1/12/17.
 */
class ReverseWords {

    static String reverse(String sentence) {
        StringBuilder builder = new StringBuilder();
        if (sentence == null) {
            return builder.toString();
        }
        int lenOfWord = 0;
        for (int i = sentence.length() - 1; i >= 0; i--) {
            if (sentence.charAt(i) != ' ') {
                lenOfWord++;
            } else {
                for (int j = 1; j <= lenOfWord; j++) {
                    builder.append(sentence.charAt(i + j));
                }
                builder.append(' ');
                lenOfWord = 0;
            }
        }
        if (lenOfWord != 0) {
            for (int i = 0; i <= lenOfWord; i++) {
                builder.append(sentence.charAt(i));
            }
        }
        return builder.toString();
    }

}
