package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
        System.out.println(myArray.push(24));
        System.out.println(myArray.toString());
    }
}