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

        Set<String> substrings = new HashSet<>(array.length * 10);
        for (int i = 0; i < array.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(array.length * 2);
            for (int j = i; j < array.length; j++) {
                stringBuilder.append(array[j]);
                substrings.add(stringBuilder.toString());
            }
        }

        return substrings;
    }
}
