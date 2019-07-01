import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPalindromeTest {
    NumberPalindrome palindrome;
    @Before
    public void setup() {
        palindrome=new NumberPalindrome();
    }
    @Test
     public void NumberisPalindrome()
    {
        String result=palindrome.CheckPalindrome(121);
        assertEquals("palindrome",result);
    }
    @Test
    public void NumberisNotPalindrome()
    {
        String result=palindrome.CheckPalindrome(12342);
        assertEquals("Not palindrome",result);
    }
    @Test
    public void NegativeNumberisNotPalindrome()
    {
        String result=palindrome.CheckPalindrome(-151);
        assertEquals("Not palindrome",result);
    }


}