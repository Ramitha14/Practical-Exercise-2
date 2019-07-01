

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckGivenNumberisPowerOf4Test {
    CheckGivenNumberisPowerOf4 obj;
    @Before
    public void setup()
    {
        obj=new CheckGivenNumberisPowerOf4();
    }
    @Test
    public void GivenNumberisPowerOf4()
    {
        boolean result=obj.GivenNumberisPowerOf4ornot(64);
        assertEquals(true,result);
    }
    @Test
    public void GivenNumberisNotPowerOf4()
    {
        boolean result=obj.GivenNumberisPowerOf4ornot(70);
        assertEquals(false,result);
    }
    @Test
    public void GivenNumberisOdd()
    {
        boolean result=obj.GivenNumberisPowerOf4ornot(31);
        assertEquals(false,result);
    }
    @Test
    public void GivenNumberisZero()
    {
        boolean result=obj.GivenNumberisPowerOf4ornot(0);
        assertEquals(false,result);
    }

}