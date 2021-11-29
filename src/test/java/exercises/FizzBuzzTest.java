package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void divisibleBy3() {
        assertEquals("Fizz", fizzBuzz.answer(3));
        assertEquals("Fizz", fizzBuzz.answer(6));
        assertEquals("Fizz", fizzBuzz.answer(9));
    }

    @Test
    public void divisibleBy5() {
        assertEquals("Buzz", fizzBuzz.answer(5));
        assertEquals("Buzz", fizzBuzz.answer(10));
        assertEquals("Buzz", fizzBuzz.answer(20));
        assertEquals("Buzz", fizzBuzz.answer(25));
    }


    @Test
    public void divisibleByBoth3And5() {
        assertEquals("FizzBuzz", fizzBuzz.answer(15));
        assertEquals("FizzBuzz", fizzBuzz.answer(30));
        assertEquals("FizzBuzz", fizzBuzz.answer(45));
        assertEquals("FizzBuzz", fizzBuzz.answer(60));
    }

    @Test
    public void displayResults() {
        for (int i = 0; i < 75; i++) {
            System.out.println(fizzBuzz.answer(i));
        }
    }


}