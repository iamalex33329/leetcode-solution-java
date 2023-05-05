/**
 *  58. Length of Last Word
 *
 *  Given a string s consisting of words and spaces,
 *  return the length of the last word in the string.
 *
 *  A word is a maximal substring consisting of non-space characters only.
 *
 */

public class Problem58 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord1("a"));
    }

    public static int lengthOfLastWord(String s) {
        s = s.toLowerCase();
        int length = 0;

        for (int i=s.length()-1; i>=0; i--) {
            if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                length++;
            } else {
                if (length != 0) return length;
            }
        }
        return 0;
    }

    public static int lengthOfLastWord1(String s) {
        int index = s.length()-1, length = 0;

        while (s.charAt(index) == ' ') { index--; }

        while (s.charAt(index) != ' ') {
            length++;
            index--;
        }
        return length;
    }
}
