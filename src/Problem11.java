/**
 *  11. Container With Most Water
 *
 *  You are given an integer array height of length n. There
 *  are n vertical lines drawn such that the two endpoints of
 *  the ith line are (i, 0) and (i, height[i]).
 *
 *  Find two lines that together with the x-axis form a container,
 *  such that the container contains the most water.
 *
 *  Return the maximum amount of water a container can store.
 *
 *  Notice that you may not slant the container.
 *
 */

public class Problem11 {

    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int result = 0;

        while (l < r) {
            if (height[l] < height[r]) {
                if (result <  height[l] * (r - l)) {
                    result = height[l] * (r - l);
                } else {
                    l++;
                }
            } else {
                if (result <  height[r] * (r - l)) {
                    result = height[r] * (r - l);
                } else {
                    r--;
                }
            }
        }

        return result;
    }
}
