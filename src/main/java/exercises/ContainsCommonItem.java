package exercises;

import java.util.HashSet;
import java.util.Set;

/**
 * Given 2 arrays, create a function that lets a user know (tru/false) whether
 * these two arrays contain any common items.
 * For example:
 * char[] array1 = {'a', 'b', 'c', 'x'};
 * char[] array2 = {'z', 'y', 'i'};
 * Should return false
 * -------------------------
 * char[] array1 = {'a', 'b', 'c', 'x'};
 * char[] array2 = {'z', 'y', 'x'};
 * should return true
 */
public class ContainsCommonItem {

    public static boolean twoArraysContainCommonItems(char[] array1, char[] array2) {
        //Guard against null input
        if(array1 == null || array2 == null){
            return false;
        }

        if (array1.length < array2.length) {
            return storeSmallerArray(array2, array1);
        } else {
            return storeSmallerArray(array1, array2);
        }
    }

    //Place the smaller of the two arrays into the Set
    // so that we save memory in the event that one array is much larger than the other
    private static boolean storeSmallerArray(char[] largerArray, char[] smallerArray) {
        Set<Character> viewedArray2Chars = addArrayToSet(smallerArray);

        for (char value : largerArray) {
            if (viewedArray2Chars.contains(value)) {
                return true;
            }
        }

        return false;
    }

    private static Set<Character> addArrayToSet(char[] data) {
        Set<Character> itemSet = new HashSet<>();
        for (char item : data) {
            itemSet.add(item);
        }

        return itemSet;
    }

    public static boolean twoArraysContainCommonItemsV2(char[] array1, char[] array2) {
        //Guard against null input
        if(array1 == null || array2 == null){
            return false;
        }

        Set<Character> viewedArray2Chars = addArrayToSet(array2);

        int index2 = 0;
        for (char value : array1) {
            if (viewedArray2Chars.contains(value)) {
                return true;
            }
            if (index2 < array2.length){
                viewedArray2Chars.add(array2[index2++]);
            }
        }

        return false;
    }

}
