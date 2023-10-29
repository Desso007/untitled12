package edu;
import edu.hw3.Task5;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task5test {
    @Test
    public void testAscendingOrder() {
        String[] contacts = {"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"};
        String[] expected = {"Thomas Aquinas", "Rene Descartes", "David Hume", "John Locke"};
        assertArrayEquals(expected, Task5.parseContacts(contacts, "ASC"));
    }

    public void testDescendingOrder() {
        String[] contacts = {"Paul Erdos", "Leonhard Euler", "Carl Gauss"};
        String[] expected = {"Paul Erdos", "Leonhard Euler", "Carl Gauss"};
        assertArrayEquals(expected, Task5.parseContacts(contacts, "DESC"));
    }

    @Test
    public void testEmptyArray() {
        String[] contacts = {};
        String[] expected = {};
        assertArrayEquals(expected, Task5.parseContacts(contacts, "ASC"));
    }

    @Test
    public void testNullArray() {
        String[] contacts = null;
        String[] expected = new String[0];
        assertArrayEquals(expected, Task5.parseContacts(contacts, "ASC"));
    }
}
