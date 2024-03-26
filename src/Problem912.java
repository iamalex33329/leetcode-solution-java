/**
 *  912. Sort an Array
 *
 *  Given an array of integers nums, sort the array in ascending order
 *  and return it.
 *
 *  You must solve the problem without using any built-in functions in
 *  O(nlog(n)) time complexity and with the smallest space complexity
 *  possible.
 *
 */

public class Problem912 {

    public int[] sortArray(int[] nums) {

        mergeSort(nums, nums.length);

        return nums;
    }

    private void mergeSort(int[] arr, int n) {

        // Divide
        if (n < 2) return;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        System.arraycopy(arr, 0, l, 0, mid);
        System.arraycopy(arr, mid, r, 0, n - mid);

        mergeSort(l, mid);
        mergeSort(r, n - mid);

        // Combine
        int i = 0, j = 0, k = 0;

        while (i < mid && j < n-mid) {
            if (l[i] <= r[j]) { arr[k++] = l[i++]; }
            else { arr[k++] = r[j++]; }
        }

        while (i < mid) arr[k++] = l[i++];
        while (j < n-mid) arr[k++] = r[j++];
    }
}
