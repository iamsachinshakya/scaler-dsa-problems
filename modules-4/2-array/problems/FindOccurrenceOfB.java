import java.util.ArrayList;
import java.util.Arrays;

/**
 * Problem:
 * --------
 * Given an integer array A and an integer B,
 * find and return the total number of times B occurs in A.
 *
 * Example:
 * A = [7, 1, 2, 7, 7, 3, 6], B = 7
 * Output = 3 (since 7 appears 3 times)
 */

public class FindOccurrenceOfB {

    /**
     * Approach 1: Linear scan and counting
     * -------------------------------------
     * Logic:
     * - Initialize count = 0
     * - Traverse each element in the array
     * - Increment count whenever element == B
     * - Return the final count
     *
     * Time Complexity: O(N)
     * → We check each element once
     * Space Complexity: O(1)
     * → Uses only one integer variable
     */
    public static int approachOne(ArrayList<Integer> al, int B) {
        if (al == null || al.isEmpty()) {
            return 0; // Edge case: empty or null list
        }

        int count = 0;

        for (int num : al) {
            if (num == B) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(7, 1, 2, 7, 7, 3, 6));

        int result1 = approachOne(data, 7);
        System.out.println("Result (Approach 1) -> " + result1);
    }
}
