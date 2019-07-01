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
        public void StringisPalindrome()
        {
            String result=palindrome.CheckPalindrome("malayalam");
            assertEquals("palindrome",result);
        }
        @Test
        public void StringisNotPalindrome()
        {
            String result=palindrome.CheckPalindrome("hello");
            assertEquals("Not palindrome",result);
        }


    }
