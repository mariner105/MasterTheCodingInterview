package recursion;

public class Inception {
    private int counter;

    public Inception() {
        this.counter = 0;
    }

    public String inception() {
        System.out.println("Counter: " + counter);
        //Base case
        if (counter > 3) {
            return "done!";
        }
        counter++;
        //Returning inception() will bubble the base case
        // return value up the stack.
        return inception();
    }
}
