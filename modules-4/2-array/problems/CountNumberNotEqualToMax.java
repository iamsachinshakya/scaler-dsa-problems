import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem:
 * --------
 * Given an integer array A, count how many elements have
 * at least one element greater than themselves.
 * 
 * In simpler words:
 * → Count all elements that are NOT equal to the maximum value.
 * 
 * Example:
 * A = [3, 1, 2] → Max = 3 → Elements less than max = {1, 2} → Output = 2
 */

public class CountNumberNotEqualToMax {

    /**
     * Approach 1: Two-pass solution
     * ------------------------------
     * Step 1 → Find the maximum element in the array.
     * Step 2 → Count how many elements are less than the maximum.
     * 
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static int approachOne(ArrayList<Integer> al) {
        if (al == null || al.isEmpty()) {
            return 0; // Edge case: empty list
        }

        // Step 1: Find maximum value
        int max = Integer.MIN_VALUE;
        for (int num : al) {
            if (num > max) {
                max = num;
            }
        }

        // Step 2: Count elements smaller than the max
        int count = 0;
        for (int num : al) {
            if (num < max) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 1, 2));
        System.out.println("Result 1 -> " + approachOne(list1)); // Output: 2

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 5, 3));
        System.out.println("Result 2 -> " + approachOne(list2)); // Output: 1

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Result 3 -> " + approachOne(list3)); // Output: 5
    }
}
