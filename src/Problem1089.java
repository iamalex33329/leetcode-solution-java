/**
 *  1089. Duplicate Zeros
 *
 *  Given a fixed-length integer array arr, duplicate each occurrence of
 *  zero, shifting the remaining elements to the right.
 *
 *  Note that elements beyond the length of the original array are not
 *  written. Do the above modifications to the input array in place and
 *  do not return anything.
 *
 */

public class Problem1089 {

    public void duplicateZeros(int[] arr) {
        int[] cloneArr = arr.clone();
        int len = arr.length;
        int index = 0;

        for (int i = 0; i < len && index != len; i++) {
            arr[index++] = cloneArr[i];
            if (cloneArr[i] == 0 && index != len) arr[index++] = 0;
        }
    }
}
