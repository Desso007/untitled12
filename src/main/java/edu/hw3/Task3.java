package edu.hw3;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.Arrays;
public class Task3 {
    public static Map<Object, Integer> freqDict(List<Object> lst) {
        Map<Object, Integer> freq = new HashMap<>();
        for (Object item : lst) {
            if (freq.containsKey(item)) {
                freq.put(item, freq.get(item) + 1);
            } else {
                freq.put(item, 1);
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        List<Object> input1 = Arrays.asList("a", "bb", "a", "bb");
        List<Object> input2 = Arrays.asList("this", "and", "that", "and");
        List<Object> input3 = Arrays.asList("код", "код", "код", "bug");
        List<Object> input4 = Arrays.asList(1, 1, 2, 2);

        Map<Object, Integer> freqMap1 = freqDict(input1);
        Map<Object, Integer> freqMap2 = freqDict(input2);
        Map<Object, Integer> freqMap3 = freqDict(input3);
        Map<Object, Integer> freqMap4 = freqDict(input4);

        System.out.println(freqMap1);
        System.out.println(freqMap2);
        System.out.println(freqMap3);
        System.out.println(freqMap4);
    }
}
