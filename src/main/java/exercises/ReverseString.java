package exercises;

//Write a function that reverses a string. The input string is given as an array of characters s.
//
//        You must do this by modifying the input array in-place with O(1) extra memory.
//
//        Example 1:
//
//        Input: s = ["h","e","l","l","o"]
//        Output: ["o","l","l","e","h"]
//        Example 2:
//
//        Input: s = ["H","a","n","n","a","h"]
//        Output: ["h","a","n","n","a","H"]
//
//
//        Constraints:
//
//        1 <= s.length <= 105
//        s[i] is a printable ascii character.

public class ReverseString {

    /**
     * Reverses a string in place.
     * @param s
     */
    public void reverse(char[] s) {
        //Special case
        if (s == null || s.length == 1) {
            return;
        }

        int i = 0;
        int j = s.length - 1;

        while(i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }

    }
}
