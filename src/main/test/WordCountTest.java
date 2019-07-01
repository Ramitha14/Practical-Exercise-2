import org.junit.Test;

import static org.junit.Assert.*;

public class WordCountTest {

    WordCount wordCount;

    @Test
    public void countWordsTest(){
        wordCount = new WordCount();
        wordCount.countWords();
    }
}


