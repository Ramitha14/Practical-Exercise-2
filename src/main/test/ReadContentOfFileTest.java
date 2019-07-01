import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;
public class ReadContentOfFileTest {
    ReadContentOfFile readFile;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUp(){
        readFile = new ReadContentOfFile();
//    set a new output print stream
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void tearDown(){
//    Reassigns System.out as a print stream
        System.setOut(originalOut);
    }
    @Test
    public void readFile(){
        readFile.readFileContent("/home/IdeaProjects/Java PE2-Assignment/src/main/java/com/stackroute/pe2/test.txt");
        assertEquals("HELLO WORLD HAI", outContent.toString());
    }
    @Test
    public void readEmptyFile(){
        readFile.readFileContent("/home/IdeaProjects/Java PE2-Assignment/src/main/java/com/stackroute/pe2/empty.txt");
        assertEquals("", outContent.toString());
    }

    @Test
    public void readUnavailableFile(){
        readFile.readFileContent("/home/IdeaProjects/Java PE2-Assignment/src/main/java/com/stackroute/pe2/empty2.txt");
        assertEquals("IO Exception", outContent.toString());
    }
}
