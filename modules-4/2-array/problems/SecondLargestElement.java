import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem:
 * ----------
 * Given an integer array A, find the second largest distinct element.
 * If no such element exists (e.g., all numbers are same or array has < 2
 * elements),
 * return -1.
 *
 * Example:
 * A = [4, 2, 3, 5]
 * Output = 4 (since 5 is the largest and 4 is the second largest)
 */

public class SecondLargestElement {

    /**
     * Approach: Single-pass tracking of two largest elements
     * --------------------------------------------------------
     * Logic:
     * 1. Maintain two variables: `first` (largest) and `second` (second largest).
     * 2. Iterate over all elements:
     * - If current number > first → update `second = first`, then `first = num`.
     * - Else if current number < first and num > second → update `second = num`.
     * 3. After traversal:
     * - If `second` is still Integer.MIN_VALUE → no valid second largest found.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static int approachOne(ArrayList<Integer> al) {
        if (al == null || al.size() < 2) {
            return -1; // No second largest possible
        }

        int first = Integer.MIN_VALUE; // largest
        int second = Integer.MIN_VALUE; // second largest

        for (int num : al) {
            if (num > first) {
                // Found new largest → push current largest to second
                second = first;
                first = num;
            } else if (num < first && num > second) {
                // num is between first and second
                second = num;
            }
        }

        // If no distinct second largest found
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(4, 2, 3, 5));
        int result = approachOne(al);
        System.out.println("Second Largest Element -> " + result);
    }
}
