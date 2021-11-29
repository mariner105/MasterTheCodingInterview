package exercises;

//Given an integer n, return a string array answer
// (1-indexed) where:
//
//        answer[i] == "FizzBuzz" if i is divisible by
//          3 and 5.
//        answer[i] == "Fizz" if i is divisible by 3.
//        answer[i] == "Buzz" if i is divisible by 5.
//        answer[i] == i if none of the above conditions are true.
public class FizzBuzz {
    public String answer(Integer i) {
        if (i == 0) {
            // Invalid input
            return i.toString();
        }

        if (i % 15 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return i.toString();
        }
    }
}
