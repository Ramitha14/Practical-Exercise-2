import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindFactorialOfNumberTest {
    FindFactorialOfNumber object;
    @Before
    public void setup()
    {
        object =new FindFactorialOfNumber();
    }
    @Test
    public void toFindFactorialOfPositiveNumber()
    {
        int result= object.findFactorialOfGivenNumber(12);
        assertEquals(479001600,result);

    }

}