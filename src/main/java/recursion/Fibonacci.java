package recursion;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * Given a number N return the index value of the Fibonacci sequence,
 * where the sequence is:
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
 * the pattern of the sequence is that each value is the sum of
 * the 2 previous values, that means that for N=5 -> 2+3.
 */
public class Fibonacci {

    Map<Integer, Integer> cache;

    public Fibonacci() {
        this.cache = new Hashtable<>(400);
    }

    public int fibonacciIterative(int n) { // O(n) This is much better than the recursive version
        int[] arr = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        //Store each Fibonacci in the array at its index
        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr[n];
    }

    /**
     * Non-optimized solution
     * @param n the value whose fibonacci sequence to calculate
     * @return the value whose fibonacci sequence to calculate
     */
    public int fibonacciRecursiveOld(int n) { //O(2^n) Very bad
        //Base case
        if (n < 2) {
            return n;
        }

        return fibonacciRecursiveOld(n-1) + fibonacciRecursiveOld(n - 2);
    }

    /**
     * This method has been updated to use memoization (caching) in order
     * to be more efficient.
     * @param n the value whose fibonacci sequence to calculate
     * @return the fibonacci sequence
     */
    public int fibonacciRecursive(int n) { //O(2^n) Very bad
        if (!cache.containsKey(n)) {
            if (n < 2) {
                return n;
            }
            cache.put(n, fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2));
        }
        return cache.get(n);
    }


}
