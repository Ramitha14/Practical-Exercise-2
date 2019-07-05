import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumberPalindromeTest {
    NumberPalindrome palindrome;
    @Before
    public void setup()
    {
        palindrome=new NumberPalindrome();
    }
    @Test
     public void givenNumberShouldReturnPalindrome()
    {
        String result=palindrome.checkPalindrome(121);
        assertEquals("palindrome",result);
    }
    @Test
    public void givenNumberShouldReturnNotPalindrome()
    {
        String result=palindrome.checkPalindrome(12342);
        assertEquals("Not palindrome",result);
    }
    @Test
    public void givenNumberShouldReturnNotPalindromeforNegativeNumber()
    {
        String result=palindrome.checkPalindrome(-151);
        assertEquals("Not palindrome",result);
    }


}