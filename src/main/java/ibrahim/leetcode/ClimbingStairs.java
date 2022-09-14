package ibrahim.leetcode;

/**
 * @Author ibrahim
 * @create 14.09.2022 18:34
 * <a href="https://leetcode.com/problems/climbing-stairs/">...</a>
 */
public class ClimbingStairs {
    /**
     * Actually problem is fibonacci, only with fancy words
     * 2, 1 1,2 = 2
     * 3, 1 1 1, 2, 1, 1, 2 = 3
     * 4, 1 1 1 1, 1 1 2, 1 2 1, 2 1 1, 1, 2 2
     */

    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int current = 1;
        int previous = 1;
        int previousPrevious = 1;

        //memorization, dynamic programing 101
        //keep previous calculation ( wee need only previous two calculation)
        for (int i = 2; i <= n; i++) {
            current = previous + previousPrevious;

            previousPrevious = previous;
            previous = current;
        }

        return current;
    }

/*
   //memorization keep all calculations on array
    public int climbStairs(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] memoryTable = new int[n + 1];
        memoryTable[0] = 1;
        memoryTable[1] = 1;

        int current = 1;
        int previous = 1;
        int previousPrevious = 1;

        //memorization, dynamic programing 101
        //keep previous calculation
        for (int i = 2; i <= n; i++) {
            memoryTable[i] = memoryTable[i - 1] + memoryTable[i - 2];
        }

        return memoryTable[n];
    }
 */
}
