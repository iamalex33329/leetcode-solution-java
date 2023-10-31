/**
 *  150. Evaluate Reverse Polish Notation
 *
 *  You are given an array of strings tokens that represents an
 *  arithmetic expression in a Reverse Polish Notation.
 *
 *  Evaluate the expression. Return an integer that represents
 *  the value of the expression.
 *
 */

import java.util.Stack;

public class Problem150 {

    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for (String t : tokens) {
            if (t.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if (t.equals("-")) {
                int x2 = stack.pop();
                int x1 = stack.pop();
                stack.push(x1 - x2);
            } else if (t.equals("/")) {
                int x2 = stack.pop();
                int x1 = stack.pop();
                stack.push(x1 / x2);
            } else if (t.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else {
                stack.push(Integer.parseInt(t));
            }
        }
        return stack.pop();
    }
}
