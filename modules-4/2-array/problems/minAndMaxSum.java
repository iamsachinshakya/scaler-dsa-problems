import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given an array A of size N.
 * You need to find the sum of the Maximum and Minimum elements in the given array.
 */
public class minAndMaxSum {
    /*
     * Approach 1: Single-pass linear scan
     * ------------------------------------
     * Time Complexity: O(N)
     * -> We traverse the array once to find min and max.
     *
     * Space Complexity: O(1)
     * -> We use only constant extra space.
     *
     * Steps:
     * 1. Initialize both minElement and maxElement with the first element.
     * 2. Traverse the array once.
     * 3. Update minElement if the current number is smaller.
     * 4. Update maxElement if the current number is larger.
     * 5. Return the sum of minElement + maxElement.
     */
    public static int approachOne(ArrayList<Integer> A) {
        // Edge case: if list is null or empty
        if (A == null || A.isEmpty())
            return 0;

        int minElement = A.get(0);
        int maxElement = A.get(0);

        for (int num : A) {
            if (num < minElement) {
                minElement = num;
            }
            if (num > maxElement) {
                maxElement = num;
            }
        }
        return minElement + maxElement;
    }

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(-5, 2, 3, 4, 5, 6));
        int result = approachOne(al);

        // Output result
        System.out.println("Sum of min and max -> " + result);
    }
}
