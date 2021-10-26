package hashs;

import java.util.ArrayList;
import java.util.List;

public class HashTable {

    private final List<List<HashItem>> items;
    private final int size;

    /**
     * This will create a HashTable with a given tableSize.
     * Note that there will be fewer collisions with a bigger
     * tableSize than with a smaller tableSize.
     * @param tableSize
     */
    public HashTable(int tableSize) {
        this.items = new ArrayList<>(tableSize);
        this.size = tableSize;
        initializeTable();
    }

    public void set(String key, int value) {
        int address = hash(key);
        //Initialize the bucket the first time that we need to store
        // something in it.
        if (this.items.get(address) == null) {
            this.items.set(address, new ArrayList<>(5));
        }
        List<HashItem> listAtAddress = items.get(address);
        HashItem hashItem = new HashItem(key, value);
        listAtAddress.add(hashItem);
        this.items.set(address, listAtAddress);

    }

    public HashItem get(String key) {
        int address = hash(key);
        List<HashItem> currentBucket = items.get(address);
        int itemIndex = getIndex(currentBucket, key);
        return currentBucket.get(itemIndex);
}

    /**
     * Returns a list of keys from the HashTable.
     * @return list of keys.
     */
    public List<String> keys() {
        List<String> keys = new ArrayList<>(size * 5);
        for (List<HashItem> bucket : items) {
            //A bucket will be null if nothing was added to it.
            if (bucket != null) {
                for (HashItem item : bucket) {
                    keys.add(item.getKey());
                }
            }
        }
        return keys;
    }

    private int getIndex(List<HashItem> subList, String key) {
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

    private int hash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.size;
        }
        return hash;
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
