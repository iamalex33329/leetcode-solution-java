/**
 *  989. Add to Array-Form of Integer
 *
 *  The array-form of an integer num is an array representing its
 *  digits in left to right order.
 *
 *  For example, for num = 1321, the array form is [1,3,2,1].
 *
 *  Given num, the array-form of an integer, and an integer k, return
 *  the array-form of the integer num + k.
 *
 */

import java.util.ArrayList;
import java.util.List;

class Problem989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> numList = new ArrayList<>();
        for (int digit : num) numList.add(digit);

        int carry = 0, sum = 0;
        int i = numList.size() - 1;

        while (k != 0 || carry != 0) {
            if (i >= 0) {
                sum = numList.get(i) + k % 10 + carry;
                numList.set(i, sum % 10);
            } else {
                sum = k % 10 + carry;
                numList.add(0, sum % 10);
            }
            carry = sum / 10;
            k /= 10;
            i--;
        }

        return numList;
    }
}
