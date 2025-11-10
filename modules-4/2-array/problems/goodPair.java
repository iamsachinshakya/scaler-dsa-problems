import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
 * Given an array A and an integer B. 
 * A pair (i, j) in the array is a good pair if i != j and (A[i] + A[j] == B).
 * Check if any good pair exists or not.
 */
public class goodPair {

    /*
     * Approach 1: Brute Force
     * Time Complexity : O(n^2)
     * Space Complexity : O(1)
     */
    public static int approachOne(ArrayList<Integer> A, int B) {
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                if (A.get(i) + A.get(j) == B) {
                    return 1;
                }
            }
        }
        return 0;
    }

    /*
     * Approach 2: Optimized using HashSet
     * Time Complexity : O(n)
     * Space Complexity : O(n)
     */
    public static int approachTwo(ArrayList<Integer> A, int B) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : A) {
            int target = B - num;
            if (set.contains(target)) {
                return 1;
            }
            set.add(num);
        }

        return 0;
    }

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>(Arrays.asList(1, 2, 3, 6));

        int result1 = approachOne(data, 7);
        System.out.println("Result (Approach 1) -> " + result1);

        int result2 = approachTwo(data, 7);
        System.out.println("Result (Approach 2) -> " + result2);
    }
}
