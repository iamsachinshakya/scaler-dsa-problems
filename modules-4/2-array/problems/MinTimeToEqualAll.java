import java.util.ArrayList;
import java.util.Arrays;

/*
 * Problem:
 * ----------
 * Given an array A of integers, you can increment one element by 1 in each operation.
 * Find the minimum total number of operations required to make all elements equal.
 *
 * Example:
 * A = [1, 2, 3, 4, 5, 6]
 * Max element = 6
 * To make all equal to 6:
 *   (6-1) + (6-2) + (6-3) + (6-4) + (6-5) + (6-6)
 * = 5 + 4 + 3 + 2 + 1 + 0 = 15 operations
 */

public class MinTimeToEqualAll {

    /**
     * Approach: Calculate operations to make all elements equal to the maximum
     * value.
     * -------------------------------------------------------------------------------
     * Logic:
     * - The best way to make all elements equal is to raise all smaller numbers
     * to the value of the maximum element.
     *
     * Steps:
     * 1. Find the maximum element in the array.
     * 2. For each element, calculate (maxElement - element).
     * 3. Sum up all these differences — this gives total operations needed.
     *
     * Time Complexity: O(N)
     * -> One pass to find max, another to sum differences.
     * Space Complexity: O(1)
     * -> Uses only a few extra variables.
     */
    public static int approachOne(ArrayList<Integer> al) {
        if (al == null || al.isEmpty()) {
            return 0; // no elements, no time needed
        }

        int maxElement = Integer.MIN_VALUE;
        int totalTime = 0;

        // Step 1: Find the maximum element
        for (int num : al) {
            if (num > maxElement) {
                maxElement = num;
            }
        }

        // Step 2: Calculate total time (difference from max)
        for (int num : al) {
            totalTime += maxElement - num;
        }

        return totalTime;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int result = approachOne(al);
        System.out.println("Minimum time to make all elements equal: " + result);
    }
}
