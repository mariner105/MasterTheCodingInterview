package hashs;

import java.util.Objects;

public class HashItem {

    private final String key;
    private final int value;

    public HashItem(String key, int  value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HashItem hashItem = (HashItem) o;
        return value == hashItem.value && Objects.equals(key, hashItem.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "Data{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
