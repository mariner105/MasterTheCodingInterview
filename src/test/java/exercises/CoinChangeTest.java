package exercises;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {

    CoinChange coinChange;

    @BeforeEach
    void setUp() {
        coinChange = new CoinChange();
    }

    @Test
    public void positiveCase() {
        int[] coins = {1, 2, 5};
        int amount = 11;
        assertEquals(3, coinChange.coinChange(coins, amount));
    }
}