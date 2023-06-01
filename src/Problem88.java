/**
 *  88. Merge Sorted Array
 *
 *  You are given two integer arrays nums1 and nums2, sorted in
 *  non-decreasing order, and two integers m and n, representing
 *  the number of elements in nums1 and nums2 respectively.
 *
 */

public class Problem88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] results = new int[m+n];

        int i = 0, j = 0, k = 0;
        while (m != i && n != j) {
            if (nums1[i] >= nums2[j]) {
                results[k] = nums1[i++];
            } else {
                results[k] = nums2[j++];
            }
            k++;
        }
        if (m == i) {
            while (n != j) {
                results[k] = nums2[j];
                k++; j++;
            }
        } else if (n == j) {
            while (m != i) {
                results[k] = nums1[i];
                k++; i++;
            }
        }

        nums1 = results;
    }
}
