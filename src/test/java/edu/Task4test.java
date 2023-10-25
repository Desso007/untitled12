package edu;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import edu.hw3.Task4;
public class Task4test {

    @Test
    public void testConvertToRomanWithTwo() {
        assertEquals("II", Task4.convertToRoman(2));
    }

    @Test
    public void testConvertToRomanWithTwelve() {
        assertEquals("XII", Task4.convertToRoman(12));
    }

    @Test
    public void testConvertToRomanWithSixteen() {
        assertEquals("XVI", Task4.convertToRoman(16));
    }

    @Test
    public void testConvertToRomanWithNinetyNine() {
        assertEquals("XCIX", Task4.convertToRoman(99));
    }

    @Test
    public void testConvertToRomanWithTwoHundred() {
        assertEquals("CC", Task4.convertToRoman(200));
    }

    @Test
    public void testConvertToRomanWithSevenHundredEighty() {
        assertEquals("DCCLXXX", Task4.convertToRoman(780));
    }
}
