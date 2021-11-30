package exercises;

//Given two integers a and b, return the sum of the two integers without using the operators + and -.
//
//
//
//        Example 1:
//
//        Input: a = 1, b = 2
//        Output: 3
//        Example 2:
//
//        Input: a = 2, b = 3
//        Output: 5

public class Sum2Ints {

    public int add(int x, int y) {

        //Iterate until there is no carry
        while (y != 0) {
            // carry now contains common set bits of x & y
            int carry = x & y;

            // sum of bits of x and y where at least one of the bits is not set
            x = x ^ y;

            // carry is shifted by one so that adding it to x gives
            // the required sum
            y = carry << 1;

        }

        return x;
    }
}
