/**
 *  1375. Number of Times Binary String Is Prefix-Aligned
 *
 *  Given an array of strings words and a string s, determine if
 *  s is an acronym of words.
 *
 *  The string s is considered an acronym of words if it can be
 *  formed by concatenating the first character of each string
 *  in words in order. For example, "ab" can be formed from
 *  ["apple", "banana"], but it can't be formed from ["bear", "aardvark"].
 *
 *  Return true if s is an acronym of words, and false otherwise.
 *
 */

public class Problem1375 {
    public int numTimesAllBlue(int[] flips) {
        int expectSum = 0, currSum = 0;
        int result = 0;

        for (int i=0; i<flips.length; i++) {
            expectSum += i+1;
            currSum += flips[i];

            if (expectSum == currSum) result++;
        }

        return result;
    }
}
