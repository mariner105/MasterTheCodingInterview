package hashs;

import java.util.HashSet;
import java.util.Set;

/**
 * In this class I would like to try to create a hash set that
 * contains each of the substrings from an array.
 */
public class Substrings {
    public static Set<String> mapSubstrings(int[] array) {
        if (array == null) {
            return null;
        }

        //TODO - this builds substrings from the beginning but not inside substrings
        // so we might need an inner loop to add those
        Set<String> substrings = new HashSet<>(20);
        StringBuilder stringBuilder = new StringBuilder(array.length * 2);
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            substrings.add(stringBuilder.toString());
        }

        return substrings;
    }
}
