/**
 *  1768. Merge Strings Alternately
 *
 *  You are given two strings word1 and word2. Merge the strings by adding letters
 *  in alternating order, starting with word1. If a string is longer than the other,
 *  append the additional letters onto the end of the merged string.
 *
 *  Return the merged string.
 *
 *  ref: https://mycollegenotebook.medium.com/stringbuilder-的使用-b75300871c6f
 *
 */

public class Problem1768 {

    public String mergeAlternately(String word1, String word2) {

        int maxLength = Math.max(word1.length(), word2.length());
        StringBuilder result = new StringBuilder(maxLength * 2);

        for (int i = 0; i < maxLength; i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }
}
