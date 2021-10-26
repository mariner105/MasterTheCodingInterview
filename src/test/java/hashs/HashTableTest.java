package hashs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    //We set a small table size so that we could test the
    // hash collision logic.
    public HashTable myTable;

    @BeforeEach
    public void setUp() {
        myTable = new HashTable(5);
    }

    @Test
    public void setItems() {
        myTable.set("grapes", 10000);
        myTable.set("apples", 54);
        myTable.set("grapes", 10000);
        System.out.println();
    }

    @Test
    public void getItem() {
        myTable.set("grapes", 10000);
        myTable.set("apples", 54);
        myTable.set("grape", 80000);
        myTable.set("orange", 23);
        myTable.set("tomato", 5);

        HashItem item = myTable.get("grapes");
        System.out.println(item);
        assertEquals("grapes", item.getKey());

        item = myTable.get("tomato");
        System.out.println(item);
        assertEquals("tomato", item.getKey());
    }

    @Test
    public void testKeys() {
        myTable.set("grapes", 10000);
        myTable.set("apples", 54);
        myTable.set("grape", 80000);
        myTable.set("orange", 23);
        myTable.set("tomato", 5);
        List<String> keys = myTable.keys();

        assertEquals(5, keys.size());

        assertTrue(keys.contains("grapes"));
        assertTrue(keys.contains("apples"));
        assertTrue(keys.contains("grape"));
        assertTrue(keys.contains("orange"));
        assertTrue(keys.contains("tomato"));

        assertFalse(keys.contains("plum"));
    }

}