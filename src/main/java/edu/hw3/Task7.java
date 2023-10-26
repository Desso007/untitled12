package edu.hw3;
import java.util.Comparator;
import java.util.TreeMap;
public class Task7 {
    public static void main(String[] args) {
        TreeMap<String, String> tree = new TreeMap<>(new NullSafeStringComparator());

        tree.put(null, "test");

        System.out.println(tree.containsKey(null));
    }

    public static class NullSafeStringComparator implements Comparator<String> {
        @Override
        public int compare(String s1, String s2) {
            if (s1 == null && s2 == null) {
                return 0;
            } else if (s1 == null) {
                return -1;
            } else if (s2 == null) {
                return 1;
            } else {
                return s1.compareTo(s2);
            }
        }
    }
}
