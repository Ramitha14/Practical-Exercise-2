import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumberCheckerTest {
    EvenNumberChecker evennumberchecker;

    @Before
    public void setup() {
        evennumberchecker = new EvenNumberChecker();
    }

    @Test
    public void givenNumberShouldReturnTrueforEvenNumber() {
        boolean result = evennumberchecker.isEven(24);
        assertEquals(true, result);

    }

    @Test
    public void givenNumberShouldReturnFalseforOddNumber() {
        boolean result = evennumberchecker.isEven(31);
        assertEquals(false, result);

    }

    @Test
    public void givenNumberShouldReturnTrueForZero() {
        boolean result = evennumberchecker.isEven(0);
        assertEquals(true, result);

    }
    @Test
    public void givenNegativeNumberShouldReturnTrue() {
        boolean result = evennumberchecker.isEven(-10);
        assertEquals(true, result);

    }
    @Test
    public void givenNegativeNumberShouldReturnFalse() {
        boolean result = evennumberchecker.isEven(-21);
        assertEquals(false, result);

    }
}




