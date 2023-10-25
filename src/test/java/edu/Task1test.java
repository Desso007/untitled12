package edu;
import edu.hw3.Task1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Task1test {
    private Task1 AtbashCipher;

    @Test
    public void testAtbashWithLowerCase() {
        String input = "hello";
        String expectedOutput = "svool";
        assertEquals(expectedOutput, AtbashCipher.atbash(input));
    }

    @Test
    public void testAtbashWithUpperCase() {
        String input = "HELLO";
        String expectedOutput = "SVOOL";
        assertEquals(expectedOutput, AtbashCipher.atbash(input));
    }

    @Test
    public void testAtbashWithMixedCase() {
        String input = "HeLlO";
        String expectedOutput = "SvOoL";
        assertEquals(expectedOutput, AtbashCipher.atbash(input));
    }
}
