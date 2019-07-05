import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringPalindromeTest {

        StringPalindrome palindrome;
        @Before
        public void setup() {
            palindrome=new StringPalindrome();
        }
        @Test
        public void givenStringShouldReturnPalindrome()
        {
            String result=palindrome.checkPalindrome("malayalam");
            assertEquals("palindrome",result);
        }
        @Test
        public void givenStringShouldReturnNotPalindrome()
        {
            String result=palindrome.checkPalindrome("hello");
            assertEquals("Not palindrome",result);
        }


    }
