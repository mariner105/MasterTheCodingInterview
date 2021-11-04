package exercises;

import java.util.LinkedList;
import java.util.Queue;

public class MovingAverage {
    private Queue<Integer> queue;
    private int maxSize;
    private double sum;

    /**
     * Initialize your data structure here.
     */
    public MovingAverage(int size) {
        this.queue = new LinkedList<>();
        this.maxSize = size;
        this.sum = 0.0;
    }

    public double next(int val) {
        //If full, then we need to remove before we add a new item
        if (queue.size() == maxSize) {
            sum-= queue.remove();
        }

        queue.add(val);
        sum += val;
        return sum / queue.size();
    }
}
