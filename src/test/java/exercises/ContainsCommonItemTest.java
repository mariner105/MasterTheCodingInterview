package exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsCommonItemTest {

    @Test
    public void testNull() {
        assertFalse(ContainsCommonItem.twoArraysContainCommonItems(null,null));
    }

    @Test
    public void noCommonItems() {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'z', 'y', 'i'};
        assertFalse(ContainsCommonItem.twoArraysContainCommonItems(array1,array2));
    }

    @Test
    public void emptyArray1() {
        char[] array1 = {};
        char[] array2 = {'z', 'y', 'i'};
        assertFalse(ContainsCommonItem.twoArraysContainCommonItems(array1,array2));
    }

    @Test
    public void emptyArray2() {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {};
        assertFalse(ContainsCommonItem.twoArraysContainCommonItems(array1,array2));
    }

    @Test
    public void haveCommonItems() {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'z', 'y', 'x'};
        assertTrue(ContainsCommonItem.twoArraysContainCommonItems(array1,array2));
    }

}