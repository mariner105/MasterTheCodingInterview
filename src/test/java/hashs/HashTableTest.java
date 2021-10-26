package hashs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    public HashTable myTable = new HashTable(5);

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

        Data item = myTable.get("grapes");
        System.out.println(item);
        assertEquals("grapes", item.getKey());

        item = myTable.get("tomato");
        System.out.println(item);
        assertEquals("tomato", item.getKey());
    }

}