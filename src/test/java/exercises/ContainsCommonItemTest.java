package exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ContainsCommonItemTest {

    @Test
    public void testNull() {
        assertFalse(ContainsCommonItem.twoArraysContainCommonItems(null,null));
        assertFalse(ContainsCommonItem.twoArraysContainCommonItemsV2(null,null));
    }

    @Test
    public void emptyArray1() {
        char[] array1 = {};
        char[] array2 = {'z', 'y', 'i'};
        assertFalse(ContainsCommonItem.twoArraysContainCommonItems(array1,array2));
        assertFalse(ContainsCommonItem.twoArraysContainCommonItemsV2(array1,array2));
    }

    @Test
    public void emptyArray2() {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {};
        assertFalse(ContainsCommonItem.twoArraysContainCommonItems(array1,array2));
        assertFalse(ContainsCommonItem.twoArraysContainCommonItemsV2(array1,array2));
    }

    @Test
    public void noCommonItems() {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'z', 'y', 'i'};
        assertFalse(ContainsCommonItem.twoArraysContainCommonItems(array1,array2));
        assertFalse(ContainsCommonItem.twoArraysContainCommonItemsV2(array1,array2));
    }

    @Test
    public void haveCommonItems() {
        char[] array1 = {'a', 'b', 'c', 'x'};
        char[] array2 = {'z', 'y', 'x'};
        assertTrue(ContainsCommonItem.twoArraysContainCommonItems(array1,array2));
        assertTrue(ContainsCommonItem.twoArraysContainCommonItemsV2(array1,array2));
    }

    @Test
    public void largeArray1() {
        char[] array1 = genLargeArray();
        char[] array2 = {'z', 'y', 'x'};
        assertFalse(ContainsCommonItem.twoArraysContainCommonItems(array1,array2));
    }

    private char[] genLargeArray() {
        int maxSize = 100_000;
        char[] chars = new char[maxSize];

        for (int i = 0; i < maxSize; i++) {
            chars[i] = (Character.forDigit(i%10, 10));
        }

        return chars;
    }

}