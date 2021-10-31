package recursion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InceptionTest {
    private Inception inception;

    @BeforeEach
    void setUp() {
        inception = new Inception();
    }

    @Test
    public void recursion() {
        inception.inception();
    }
}