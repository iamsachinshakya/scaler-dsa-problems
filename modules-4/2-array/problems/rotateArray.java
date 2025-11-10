import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given an integer array A of size N and an integer B,
 * rotate the array B times towards the right and return the resulting array.
 */
public class rotateArray {

    /**
     * Approach 1: Brute Force (Iterative Shifting)
     * --------------------------------------------
     * For each rotation, shift all elements one position to the right.
     *
     * Time Complexity: O(N * K)
     * -> Each rotation moves N elements, done K times.
     * Space Complexity: O(1)
     * -> In-place rotation using only a few variables.
     */
    public static ArrayList<Integer> approachOne(ArrayList<Integer> al, int k) {
        int n = al.size();
        if (n == 0)
            return al;

        int sanitizeK = k % n; // handle k > n

        for (int i = 0; i < sanitizeK; i++) {
            int lastElement = al.get(n - 1);
            // shift elements to the right by one position
            for (int j = n - 1; j > 0; j--) {
                al.set(j, al.get(j - 1));
            }
            al.set(0, lastElement);
        }

        return al;
    }

    /**
     * Approach 2: Reversal Algorithm (Efficient)
     * ------------------------------------------
     * Steps:
     * 1. Reverse the entire array
     * 2. Reverse the first K elements
     * 3. Reverse the remaining N - K elements
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static ArrayList<Integer> approachTwo(ArrayList<Integer> al, int k) {
        int n = al.size();
        if (n == 0)
            return al;

        int sanitizeK = k % n; // handle k > n
        if (sanitizeK == 0)
            return al; // no rotation needed

        reverse(al, 0, n - 1);
        reverse(al, 0, sanitizeK - 1);
        reverse(al, sanitizeK, n - 1);

        return al;
    }

    /**
     * Approach 3: Using Extra ArrayList (Simpler, not in-place)
     * ---------------------------------------------------------
     * Create a new rotated list using slicing logic.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(N)
     */
    public static ArrayList<Integer> approachThree(ArrayList<Integer> al, int k) {
        int n = al.size();
        if (n == 0)
            return al;

        k = k % n; // handle k > n
        if (k == 0)
            return al;

        ArrayList<Integer> rotatedArray = new ArrayList<>();

        // Add last K elements first
        for (int i = n - k; i < n; i++) {
            rotatedArray.add(al.get(i));
        }

        // Then add the remaining elements
        for (int i = 0; i < n - k; i++) {
            rotatedArray.add(al.get(i));
        }

        return rotatedArray;
    }

    /**
     * Utility function to reverse elements in an ArrayList between indices [start,
     * end]
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static ArrayList<Integer> reverse(ArrayList<Integer> al, int start, int end) {
        int i = start;
        int j = end;

        while (i < j) {
            int temp = al.get(i);
            al.set(i, al.get(j));
            al.set(j, temp);
            i++;
            j--;
        }

        return al;
    }

    // ----------------------------------------------------------

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Original (Approach 1): " + list1);
        ArrayList<Integer> rotated1 = approachOne(new ArrayList<>(list1), 20);
        System.out.println("Rotated (Approach 1):  " + rotated1);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("\nOriginal (Approach 2): " + list2);
        ArrayList<Integer> rotated2 = approachTwo(new ArrayList<>(list2), 20);
        System.out.println("Rotated (Approach 2):  " + rotated2);

        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("\nOriginal (Approach 3): " + list3);
        ArrayList<Integer> rotated3 = approachThree(new ArrayList<>(list3), 20);
        System.out.println("Rotated (Approach 3):  " + rotated3);
    }
}
