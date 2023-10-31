/**
 *  739. Daily Temperatures
 *
 *  Given an array of integers temperatures represents the daily
 *  temperatures, return an array answer such that answer[i] is the
 *  number of days you have to wait after the ith day to get a warmer
 *  temperature. If there is no future day for which this is possible,
 *  keep answer[i] == 0 instead.
 *
 *  參考：https://youtu.be/d4FvlTzzWjQ?si=4d2Ic2zy7zq1kP_8
 */

import java.util.Stack;

public class Problem739 {

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[temperatures.length];

        for (int i=0; i<temperatures.length; i++) {
            while (!stack.empty() && temperatures[stack.peek()] < temperatures[i]) {
                int index = stack.pop();
                answer[index] = i - index;
            }
            stack.push(i);
        }

        return answer;
    }
}
