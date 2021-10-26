package hashs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    public HashTable myTable = new HashTable(50);

    @Test
    public void demo() {
        myTable.set("grapes", 10000);
        myTable.set("apples", 54);
        myTable.set("grapes", 10000);
        System.out.println();
    }


}