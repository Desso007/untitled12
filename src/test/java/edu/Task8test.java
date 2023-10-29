package edu;

import edu.hw3.Task8;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

public class Task8test {
    @Test
    void testBackwardIterator() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Task8<Integer> backwardIterator = new Task8<>(list);

        List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);

        for (Integer value : expected) {
            assertTrue(backwardIterator.hasNext());
            assertEquals(value, backwardIterator.next());
        }

        assertFalse(backwardIterator.hasNext());
        assertThrows(NoSuchElementException.class, backwardIterator::next);
    }

    @Test
    void testEmptyCollection() {
        List<Integer> emptyList = new ArrayList<>();
        Task8<Integer> backwardIterator = new Task8<>(emptyList);

        assertFalse(backwardIterator.hasNext());
        assertThrows(NoSuchElementException.class, backwardIterator::next);
    }

    @Test
    void testRemoveNotSupported() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        Task8<Integer> backwardIterator = new Task8<>(list);

        assertThrows(UnsupportedOperationException.class, backwardIterator::remove);
    }
}
