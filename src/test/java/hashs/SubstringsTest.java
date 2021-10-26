package hashs;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SubstringsTest {
    Set<String> substrings;

    @Test
    public void oneItem() {
        int[] array = {1};
        substrings = Substrings.mapSubstrings(array);
        assertTrue(substrings.contains("1"));
    }

    @Test
    public void testNull() {
        assertNull(Substrings.mapSubstrings(null));
    }

    @Test
    public void emptyArray() {
        int[] array = {};
        substrings = Substrings.mapSubstrings(array);
        assertEquals(0, substrings.size());
    }

    @Test
    public void allSubstrings() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        substrings = Substrings.mapSubstrings(array);
        assertTrue(substrings.contains("1"));
        assertTrue(substrings.contains("12"));
        assertTrue(substrings.contains("123"));
        assertTrue(substrings.contains("1234"));
        assertTrue(substrings.contains("12345"));
        assertTrue(substrings.contains("123456"));
        assertTrue(substrings.contains("1234567"));
        assertTrue(substrings.contains("12345678"));
        assertTrue(substrings.contains("123456789"));
        assertTrue(substrings.contains("12345678910"));
    }

    @Test
    public void innerSubstring() {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        substrings = Substrings.mapSubstrings(array);
        assertTrue(substrings.contains("34"));
        assertTrue(substrings.contains("5678"));
        assertTrue(substrings.contains("5678910"));
        assertFalse(substrings.contains("0"));

    }

}