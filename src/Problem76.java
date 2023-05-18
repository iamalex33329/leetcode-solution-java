/**
 *  76. Minimum Window Substring
 *
 *  Given two strings s and t of lengths m and n respectively,
 *  return the minimum window substring of s such that every
 *  character in t (including duplicates) is included in the
 *  window. If there is no such substring, return the empty string "".
 *
 *  The testcases will be generated such that the answer is unique.
 *
 *  https://medium.com/leetcode-演算法教學/035-leetcode-76演算法-minimum-window-substring-最小窗口子字串-6513c9ef03f4
 */

public class Problem76 {

    public String minWindow(String s, String t) {
        int[] cnt = new int[128];
        for (char c : t.toCharArray()) { cnt[c]++; }

        int from = 0;
        int total = t.length();
        int min = Integer.MAX_VALUE;
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (cnt[s.charAt(i)]-- > 0) { total--; }
            while (total == 0) {
                if (i - j + 1 < min) {
                    min = i - j + 1;
                    from = j;
                }
                if (++cnt[s.charAt(j++)] > 0) { total++; }
            }
        }
        return (min == Integer.MAX_VALUE) ? "" : s.substring(from, from + min);
    }
}