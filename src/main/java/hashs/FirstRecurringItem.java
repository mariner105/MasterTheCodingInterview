package hashs;

import java.util.HashSet;
import java.util.Set;

/**
 * Google question:
 * Given an array of items, return the first one that repeats in the array.
 *
 * Given an array = {2,5,1,2,3,5,1,2,4}:
 * It should return 2
 *
 * Given an array = {2,1,1,2,3,5,1,2,4}
 * It should return 1
 *
 * Given an array = {2,3,4,5}
 * It should return undefined
 */
public class FirstRecurringItem {


    public static Integer firstRecurring(int[] array) {
        //Special cases
        if (array ==null || array.length == 0) {
            return null;
        }
        if (array.length == 1) {
            return array[0];
        }

        //Set initial capacity high enough to avoid collisions as much possible
        Set<Integer> seenItems = new HashSet<>(array.length * 4);
        for (int item : array) {
            if (seenItems.contains(item)) {
                return item;
            } else {
                seenItems.add(item);
            }
        }

        return null;
    }
}
