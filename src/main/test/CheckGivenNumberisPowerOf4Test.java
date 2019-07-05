

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckGivenNumberisPowerOf4Test {
    CheckGivenNumberisPowerOf4 object;
    @Before
    public void setup()
    {
        object =new CheckGivenNumberisPowerOf4();
    }
    @Test
    public void givenNumberShouldReturnTrueforSixtyFour()
    {
        boolean result= object.givenNumberisPowerOf4ornot(64);
        assertEquals(true,result);
    }
    @Test
    public void givenNumberShouldReturnTrueforSeventy()
    {
        boolean result= object.givenNumberisPowerOf4ornot(70);
        assertEquals(false,result);
    }
    @Test
    public void givenNumberShouldReturnFalseforThirtyOne()
    {
        boolean result= object.givenNumberisPowerOf4ornot(31);
        assertEquals(false,result);
    }
    @Test
    public void givenNumberShouldReturnFalseforZero()
    {
        boolean result= object.givenNumberisPowerOf4ornot(0);
        assertEquals(false,result);
    }

}