package exercises;

/**
 * Log all pairs of an array
 */
public class LogAllPairs {
    private static final int[] boxes = {1,2,3,4,5};

    public static void main(String[] args) {
        logAllPairsOfArray(boxes);
    }


    public static void logAllPairsOfArray(int[] boxes) {
        int index1 = 0;
        int index2 = index1 + 1;

        while (index1 < boxes.length && index2 < boxes.length) {
            System.out.println(boxes[index1++] + ", " + boxes[index2++]);
        }
    }
}
