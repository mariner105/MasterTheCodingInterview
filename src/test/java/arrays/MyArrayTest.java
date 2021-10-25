package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayTest {
    public static final int CAPACITY = 64;
    public MyArray<Integer> myArray;

    @BeforeEach
    public void setUp() {
        myArray = new MyArray<>(Integer.class, 64);
    }

    @Test
    public void pushItems() {
        for (int i = 0; i < CAPACITY; i++) {
            System.out.println(myArray.push(i));
        }
        System.out.println(myArray.toString());

        System.out.println(myArray.pop());

        //This should cause the array to increase in size
        System.out.println(myArray.push(24));
        System.out.println(myArray.push(24));
        System.out.println(myArray.push(24));
        System.out.println(myArray.push(999));

        System.out.println("=====Delete an item=====");
        System.out.println(myArray.toString());
        System.out.println(myArray.delete(5));
        System.out.println(myArray.toString());
    }

    @Test
    public void sizeAfterDelete() {
        myArray.push(1);
        assertEquals(1, myArray.getLength());
        myArray.push(8);
        assertEquals(2, myArray.getLength());
        myArray.delete(0);
        assertEquals(1, myArray.getLength());

    }
}