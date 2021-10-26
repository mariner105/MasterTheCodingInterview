package hashs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstRecurringItemTest {

    @Test
    public void findTwo() {
        int[] array = {2,5,1,2,3,5,1,2,4};
        assertEquals(2,FirstRecurringItem.firstRecurring(array));
    }

    @Test
    public void findOne() {
        int[] array = {2,1,1,2,3,5,1,2,4};
        assertEquals(1,FirstRecurringItem.firstRecurring(array));
    }

    @Test
    public void notFound() {
        int[] array = {2,3,4,5};
        assertNull(FirstRecurringItem.firstRecurring(array));
    }

    @Test
    public void nullArray() {
        assertNull(FirstRecurringItem.firstRecurring(null));
    }

    @Test
    public void emptyArray() {
        int[] array = {};
        assertNull(FirstRecurringItem.firstRecurring(array));
    }

}