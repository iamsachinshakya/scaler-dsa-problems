public class factor {

    /**
     * Count Factors - Approach 1
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int approachOne(int n) {
        int factorCount = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factorCount++;
            }
        }
        return factorCount;
    }

    /**
     * Count Factors - Approach 2 (Optimized)
     * Time Complexity: O(√n)
     * Space Complexity: O(1)
     */
    public static int approachTwo(int n) {
        int factorCount = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (i == n / i) {
                    // Perfect square, count once
                    factorCount++;
                } else {
                    // Count both i and n/i
                    factorCount += 2;
                }
            }
        }
        return factorCount;
    }

    public static void main(String[] args) {
        int n = 64;
        int resultOfApproachOne = approachOne(n);
        int resultOfApproachTwo = approachTwo(n);

        System.out.println("Factor count using approachOne for " + n + " is: " + resultOfApproachOne);
        System.out.println("Factor count using approachTwo for " + n + " is: " + resultOfApproachTwo);
    }
}
