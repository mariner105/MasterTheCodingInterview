package recursion;

/** Write two functions that find the factorial of any
 * number.  One should use recursive, the other should
 * just use a for loop.
 */
public class Factorial {

    public int findFactorialRecursive(int number) {
        //Base case
        if (number <= 2) {
            return number;
        }

        return number * findFactorialRecursive(number - 1);
    }

    public int findFactorialIterative(int number) {
        if (number <= 2) {
            return number;
        }

        for (int i = number - 1; i > 1; i--) {
            number *= i;
        }
        return number;
    }
}
