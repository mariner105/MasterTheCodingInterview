package exercises;

/**
 * Log all pairs of an array
 */
public class LogAllPairs {
    private static final int[] boxes = {1,2,3,4,5};

    public static void main(String[] args) {
        logAllPairsOfArrayN2(boxes);
    }


    /**
     * O(n^2) example (This has bad efficiency)
     * @param boxes
     */
    public static void logAllPairsOfArrayN2(int[] boxes) {
        int index1 = 0;
        int index2 = index1 + 1;

        for (int i = 0; i < boxes.length - 1; i++){
            for (int j = 1; j < boxes.length; j++) {
                System.out.println(boxes[i] + ", " + boxes[j]);
            }
        }
    }

}
