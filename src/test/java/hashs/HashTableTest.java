package hashs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    public HashTable<Data> myTable = new HashTable<>(50);

    @Test
    public void demo() {
        myTable.set("grapes");
    }


}