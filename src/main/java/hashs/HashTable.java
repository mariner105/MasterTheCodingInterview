package hashs;

import java.util.ArrayList;
import java.util.List;

public class HashTable<T> {

    private List<T> data;
    private int size;

    public HashTable(int size) {
        this.data = new ArrayList<T>(size);
        this.size = size;
    }

    private long hash(String key) {
        long hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash = (hash + key.charAt(i) * i) % this.size;
            System.out.println(hash);
        }
        return hash;
    }

    public void set(String value) {
        this.data.add((T) new Data(hash(value), value));
    }
}
