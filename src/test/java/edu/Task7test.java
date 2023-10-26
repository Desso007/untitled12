package edu;

import org.junit.jupiter.api.Test;
import edu.hw3.Task7;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.*;

public class Task7test {
    @Test
    void testTreeMapWithNullKeys() {
        TreeMap<String, String> tree = new TreeMap<>(new Task7.NullSafeStringComparator());

        tree.put(null, "test");

        assertTrue(tree.containsKey(null));
    }

    @Test
    void testTreeMapWithNonNullKeys() {
        TreeMap<String, String> tree = new TreeMap<>(new Task7.NullSafeStringComparator());

        tree.put("key1", "value1");
        tree.put("key2", "value2");

        assertTrue(tree.containsKey("key1"));
        assertTrue(tree.containsKey("key2"));
        assertFalse(tree.containsKey(null));
    }

    @Test
    void testTreeMapWithNonStringKeys() {
        TreeMap<String, String> tree = new TreeMap<>(new Task7.NullSafeStringComparator());

        tree.put(null, "test");

        assertTrue(tree.containsKey(null));
    }
}
