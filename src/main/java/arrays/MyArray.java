package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyArray<T> {
    private int length;
    private int size;
    private T[] data;
    private Class<T> clazz;

    public MyArray(Class<T> clazz, int initialCapacity) {
        if (initialCapacity == 0) {
            initialCapacity = 32;
        }
        this.size = initialCapacity;
        this.clazz = clazz;
        this.data = (T[]) Array.newInstance(clazz, initialCapacity);
    }

    public T get(int index) {
        if (index > data.length - 1) {
            return null;
        }
        return data[index];
    }

    public T pop() {
        T lastItem = data[this.length - 1];
        this.length--;
        return lastItem;
    }

    public int push(T item) {
        if (length == this.size) {
            increaseSize();
        }
        this.data[this.length] = item;
        this.length++;
        return this.length;
    }

    /**
     * This will double the size of the array by forming a new array and
     * then copying the original array data into the new array.
     */
    private void increaseSize() {
        T[] temp = data;
        this.size *= 2;
        this.data = (T[]) Array.newInstance(this.clazz, this.size);
        for (int i = 0; i < this.length; i++) {
            data[i] = temp[i];
        }
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "length=" + length +
                ", size=" + size +
                ", data=" + Arrays.toString(data) +
                ", clazz=" + clazz +
                '}';
    }
}
