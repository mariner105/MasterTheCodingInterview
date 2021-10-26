package hashs;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    private List<List<Data>> items;
    private int size;

    public HashTable(int size) {
        this.items = new ArrayList<>(size);
        this.size = size;
        initializeTable();
    }

    private int hash(int key) {
        String keyStr = String.valueOf(key);
        int hash = 0;
        for (int i = 0; i < keyStr.length(); i++) {
            hash = (hash + keyStr.charAt(i) * i) % this.size;
            System.out.println(hash);
        }
        return hash;
    }

    public void set(String key, int value) {
        int address = hash(value);
        if (this.items.get(address) == null) {
            this.items.set(address, new ArrayList<>());
        }
        List<Data> listAtAddress = items.get(address);
        Data data = new Data(key, value);
        listAtAddress.add(data);
        this.items.set(address, listAtAddress);

    }

    public String get(String value) {
        //TODO need logic here

        return null;
    }

    /**
     * This fills items with nulls where each sublist
     * would later be added.
     */
    private void initializeTable() {
        for (int i = 0; i < size; i++) {
            items.add(null);
        }
    }

}
