package arrays;

import java.util.Arrays;

/**
 * Create a method that reverses a string:
 * "Hi my name is Frank" should be:
 * "knarF si eman ym iH"
 */
public class ReverseAString {

    /**
     * This method reverses a string.
     * @param str The string to be reversed
     * @return The reversed string
     */
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuilder reversed = new StringBuilder(length);
        for (int i = length - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();
    }

}
