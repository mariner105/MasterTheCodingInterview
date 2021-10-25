package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseAStringTest {

    @Test
    public void reverse() {
        String given = "Hi my name is Frank";
        String expected = "knarF si eman ym iH";
        assertEquals(expected, ReverseAString.reverseString(given));
    }

    @Test
    public void testNull() {
        assertNull(ReverseAString.reverseString(null));
    }

    @Test
    public void testEmpty() {
        assertEquals("", ReverseAString.reverseString(""));
    }
}