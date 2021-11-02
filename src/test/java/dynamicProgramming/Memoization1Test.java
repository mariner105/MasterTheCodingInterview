package dynamicProgramming;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Memoization1Test {
    Memoization1 memoization1;

    @BeforeEach
    public void setup() {
        memoization1 = new Memoization1();
    }

    @Test
    public void addTo80() {
        for (int i = 0; i < 20_000_000; i ++) {
            memoization1.addTo80(1);
            memoization1.addTo80(2);
            memoization1.addTo80(3);
            memoization1.addTo80(4);
            memoization1.addTo80(5);
        }
        assertEquals(85, memoization1.addTo80(5));
    }

    @Test
    public void addTo80Memoized() {
        for (int i = 0; i < 20_000_000; i ++) {
            memoization1.memoizedAddTo80(1);
            memoization1.memoizedAddTo80(2);
            memoization1.memoizedAddTo80(3);
            memoization1.memoizedAddTo80(4);
            memoization1.memoizedAddTo80(5);
        }
        assertEquals(85, memoization1.memoizedAddTo80(5));
    }
}