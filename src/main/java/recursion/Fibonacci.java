package recursion;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a number N return the index value of the Fibonacci sequence,
 * where the sequence is:
 *
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144 ...
 * the pattern of the sequence is that each value is the sum of
 * the 2 previous values, that means that for N=5 -> 2+3.
 */
public class Fibonacci {

    public int fibonacciIterative(int n) { // O(n) This is much better than the recursive version
        int[] arr = new int[500];
        arr[0] = 0;
        arr[1] = 1;
        //Store each Fibonacci in the array at its index
        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i-2] + arr[i-1];
        }

        return arr[n];
    }

    public int fibonacciRecursive(int n) { //O(2^n) Very bad
        //Base case
        if (n < 2) {
            return n;
        }

        return fibonacciRecursive(n-1) + fibonacciRecursive(n - 2);
    }


}
