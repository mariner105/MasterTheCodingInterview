package hashs;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    private final List<List<Data>> items;
    private final int size;

    public HashTable(int size) {
        this.items = new ArrayList<>(size);
        this.size = size;
        initializeTable();
    }

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.size;
            System.out.println(hash);
        }
        return hash;
    }

    public void set(String key, int value) {
        int address = hash(key);
        if (this.items.get(address) == null) {
            this.items.set(address, new ArrayList<>());
        }
        List<Data> listAtAddress = items.get(address);
        Data data = new Data(key, value);
        listAtAddress.add(data);
        this.items.set(address, listAtAddress);

    }

    public Data get(String key) {
        int address = hash(key);
        List<Data> subList = items.get(address);
        int subListIndex = getIndex(subList, key);
        Data item = subList.get(subListIndex);

        return item;
    }

    private int getIndex(List<Data> subList, String key) {
        if (subList == null) {
            return -1;
        }
        for (int i = 0; i < subList.size(); i++) {
            if (subList.get(i).getKey().equals(key)) {
                return i;
            }
        }
        return -1;
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
