package edu;
import edu.hw3.Task3;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task3test {
    @Test
    public void testFreqDictWithStrings() {
        List<Object> input = Arrays.asList("a", "bb", "a", "bb");
        Map<Object, Integer> freqMap = Task3.freqDict(input);

        assertEquals(2, freqMap.get("a"));
        assertEquals(2, freqMap.get("bb"));
    }

    @Test
    public void testFreqDictWithStringsAndMixedTypes() {
        List<Object> input = Arrays.asList("this", 1, "that", 1, "this", "that", "this");
        Map<Object, Integer> freqMap = Task3.freqDict(input);

        assertEquals(3, freqMap.get("this"));
        assertEquals(2, freqMap.get("that"));
        assertEquals(2, freqMap.get(1));
    }

    @Test
    public void testFreqDictWithIntegers() {
        List<Object> input = Arrays.asList(1, 1, 2, 2);
        Map<Object, Integer> freqMap = Task3.freqDict(input);

        assertEquals(2, freqMap.get(1));
        assertEquals(2, freqMap.get(2));
    }
}
