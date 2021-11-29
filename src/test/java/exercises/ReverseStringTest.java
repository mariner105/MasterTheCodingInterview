package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ReverseStringTest {

    ReverseString reverseString;

    @BeforeEach
    void setUp() {
        reverseString = new ReverseString();
    }

    @Test
    public void testNull() {
        char[] s = null;
        reverseString.reverse(s);
        assertNull(s);
    }

    @Test
    public void testSingleChar() {
        char[] s = new char[] {'h'};
        char[] expected = new char[] {'h'};
        reverseString.reverse(s);
        assertTrue(areArraysEqual(expected, s));
    }

    @Test
    public void testHello() {
        char[] s = new char[] {'h','e','l','l','o'};
        char[] expected = new char[] {'o','l','l','e', 'h'};
        reverseString.reverse(s);
        assertTrue(areArraysEqual(expected, s));
    }

    @Test
    public void testHannah() {
        char[] s = new char[] {'H','a','n','n','a','h'};
        char[] expected = new char[] {'h','a','n','n','a','H'};
        reverseString.reverse(s);
        assertTrue(areArraysEqual(expected, s));
    }

    @Test
    public void testFrank() {
        char[] s = new char[] {'F','r','a','n','k'};
        char[] expected = new char[] {'k','n','a','r','F'};
        reverseString.reverse(s);
        assertTrue(areArraysEqual(expected, s));
    }

    /**
     * Compare the elements of each array
     * @param arr1 array of char
     * @param arr2 array of char
     * @return true if each element of arr1 equals the
     * corresponding element in arr2, false otherwise.
     */
    private boolean areArraysEqual(char[] arr1, char[] arr2) {
        //Special case
        if (arr2 == null || arr1 == null || arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr2.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}