import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindFactorialOfNumberTest {
    FindFactorialOfNumber obj;
    @Before
    public void setup()
    {
        obj=new FindFactorialOfNumber();
    }
    @Test
    public void FindFactorialOfPositiveNumber()
    {
        int result=obj.FindFactorialOfGivenNumber(12);
        assertEquals(479001600,result);

    }

}