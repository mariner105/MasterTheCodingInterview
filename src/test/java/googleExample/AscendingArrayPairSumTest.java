package googleExample;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AscendingArrayPairSumTest {

    @Test
    public void testNullArray() {
        int sum = 8;
        assertFalse(AscendingArrayPairSum.HasPairWithSum(null, sum));
        assertFalse(AscendingArrayPairSum.HasPairWithSumStoreComps(null, sum));
    }

    @Test
    public void testTrue() {
        int[] arrayUnderTest = {1,2,4,4};
        int sum = 8;
        assertTrue(AscendingArrayPairSum.HasPairWithSum(arrayUnderTest, sum));
        assertTrue(AscendingArrayPairSum.HasPairWithSumStoreComps(arrayUnderTest, sum));
    }

    @Test
    public void testFindingSelf() {
        int[] arrayUnderTest = {1,2,4,0};
        int sum = 8;
        assertFalse(AscendingArrayPairSum.HasPairWithSum(arrayUnderTest, sum));
        assertFalse(AscendingArrayPairSum.HasPairWithSumStoreComps(arrayUnderTest, sum));
    }

    @Test
    public void testNegativeTrue() {
        int[] arrayUnderTest = {-99, -80, -2, 1,2,4,10};
        int sum = 8;
        assertTrue(AscendingArrayPairSum.HasPairWithSum(arrayUnderTest, sum));
        assertTrue(AscendingArrayPairSum.HasPairWithSumStoreComps(arrayUnderTest, sum));
    }

    @Test
    public void testNegativeSumTrue() {
        int[] arrayUnderTest = {-99, -80, -6, -2, 1,2,4,10};
        int sum = -8;
        assertTrue(AscendingArrayPairSum.HasPairWithSum(arrayUnderTest, sum));
        assertTrue(AscendingArrayPairSum.HasPairWithSumStoreComps(arrayUnderTest, sum));
    }

    @Test
    public void testNoMatch() {
        int[] arrayUnderTest = {1,2,3,9};
        int sum = 8;
        assertFalse(AscendingArrayPairSum.HasPairWithSum(arrayUnderTest, sum));
        assertFalse(AscendingArrayPairSum.HasPairWithSumStoreComps(arrayUnderTest, sum));
    }

    @Test
    public void testEmptyArray() {
        int[] arrayUnderTest = {};
        int sum = 8;
        assertFalse(AscendingArrayPairSum.HasPairWithSum(arrayUnderTest, sum));
        assertFalse(AscendingArrayPairSum.HasPairWithSumStoreComps(arrayUnderTest, sum));
    }


}