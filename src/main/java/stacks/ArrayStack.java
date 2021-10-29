package stacks;

/**
 * A stack made from an array.
 */
public class ArrayStack {

    private final String[] stack;

    private final int top;
    private int length;

    public ArrayStack() {
        stack = new String[50];
        top = 0;
    }

    public String peek() {
        return stack[top];
    }

    public ArrayStack push(String item) {
        //Special case
        if (item == null) {
            return this;
        }

        shiftStackDown();
        stack[top] = item;
        length++;
        return this;
    }

    private void shiftStackDown() {
        for (int i = length - 1; i > -1; i--) {
            stack[i + 1] = stack[i];;
        }
    }

    public String pop() {
        //Special case
        if (length == 0) {
            return null;
        }

        String temp = stack[top];
        shiftStackUp();

        length--;
        return temp;
    }

    private void shiftStackUp() {
        for (int i = 1; i < length; i++) {
            stack[i - 1] = stack[i];
        }
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        for (int i = 0; i < length; i++) {
            stringBuilder
                .append(stack[i])
                .append("\n");
        }

        return stringBuilder.toString();
    }
}
