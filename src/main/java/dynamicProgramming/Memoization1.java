package dynamicProgramming;

import java.util.Hashtable;
import java.util.Map;

public class Memoization1 {

    Map<Integer, Integer> cache;

    public Memoization1() {
        this.cache = new Hashtable<>();
    }

    /**
     * This method calculates the result each time that it is called
     * and thus will take longer than a cached version if called many
     * times with the same inputs.
     * @param n
     * @return
     */
    public int addTo80(int n) {
        return n + 80;
    }

    /**
     * This method uses caching which will speed its throughput
     * if it gets called many times with the same input values.
     * @param n the value to add to 80
     * @return the result
     */
    public int memoizedAddTo80(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else {
            cache.put(n, n + 80);
            return cache.get(n);
        }
    }



}
