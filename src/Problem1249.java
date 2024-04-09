/**
 *  1249. Minimum Remove to Make Valid Parentheses
 *
 *  Given a string s of '(' , ')' and lowercase English characters.
 *
 *  Your task is to remove the minimum number of parentheses ( '(' or ')',
 *  in any positions ) so that the resulting parentheses string is valid
 *  and return any valid string.
 *
 *  Formally, a parentheses string is valid if and only if:
 *
 *  - It is the empty string, contains only lowercase characters, or
 *  - It can be written as AB (A concatenated with B), where A and B are valid strings, or
 *  - It can be written as (A), where A is a valid string.
 *
 */

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Problem1249 {

    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        Set<Integer> avoidIndex = new HashSet<>();

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(') stack.add(i);

            if (s.charAt(i) == ')') {
                if ((stack.isEmpty())) avoidIndex.add(i);
                else stack.pop();
            }
        }

        avoidIndex.addAll(stack);

        StringBuilder result = new StringBuilder();

        for (int i=0; i<s.length(); i++) {
            if (avoidIndex.contains(i)) continue;
            result.append(s.charAt(i));
        }

        return result.toString();
    }
}
