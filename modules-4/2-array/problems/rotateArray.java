import java.util.ArrayList;
import java.util.Arrays;

public class rotateArray {

    /**
     * Approach 1: Rotate array to the right by k positions
     * Using iterative shifting (brute-force approach)
     * 
     * Time Complexity: O(n * k)
     * - Each rotation (k times) shifts n elements
     * Space Complexity: O(1)
     * - In-place rotation using only a few variables
     */
    public static ArrayList<Integer> approachOne(ArrayList<Integer> al, int k) {
        int n = al.size();
        if (n == 0)
            return al;

        int sanitizeK = k % n; // To handle k > n

        for (int i = 0; i < sanitizeK; i++) {
            int lastElement = al.get(n - 1);
            for (int j = n - 1; j > 0; j--) {
                al.set(j, al.get(j - 1));
            }
            al.set(0, lastElement);
        }

        return al;
    }

    /**
     * Utility function to reverse elements in an ArrayList between indices [start,
     * end]
     * 
     * Time Complexity: O(n)
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

    /**
     * Approach 2: Rotate array to the right by k positions
     * Using the reversal algorithm (efficient)
     * 
     * Steps:
     * 1. Reverse the entire array
     * 2. Reverse the first k elements
     * 3. Reverse the remaining n-k elements
     * 
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static ArrayList<Integer> approachTwo(ArrayList<Integer> al, int k) {
        int n = al.size();
        if (n == 0)
            return al;

        int sanitizeK = k % n;

        reverse(al, 0, n - 1);
        reverse(al, 0, sanitizeK - 1);
        reverse(al, sanitizeK, n - 1);

        return al;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("Original 1: " + list1);
        ArrayList<Integer> rotated1 = approachOne(new ArrayList<>(list1), 20);
        System.out.println("Rotated (Approach 1): " + rotated1);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println("\nOriginal 2: " + list2);
        ArrayList<Integer> rotated2 = approachTwo(new ArrayList<>(list2), 20);
        System.out.println("Rotated (Approach 2): " + rotated2);
    }
}
