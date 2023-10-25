package edu.hw3;
import java.util.Arrays;
import java.util.Comparator;

public class Task5 {
    public static String[] parseContacts(String[] names, String order) {
        if (names == null || names.length == 0) {
            return new String[0];
        }

        Comparator<String> comparator = Comparator.comparing(name -> {
            String[] parts = name.split(" ");
            return parts.length > 1 ? parts[1] : parts[0];
        });

        if (order.equals("ASC")) {
            Arrays.sort(names, comparator);
        } else if (order.equals("DESC")) {
            Arrays.sort(names, comparator.reversed());
        }

        return names;
    }

    public static void main(String[] args) {
        String[] contacts1 = {"John Locke", "Thomas Aquinas", "David Hume", "Rene Descartes"};
        String[] sortedContacts1 = parseContacts(contacts1, "ASC");
        System.out.println(Arrays.toString(sortedContacts1));

        String[] contacts2 = {"Paul Erdos", "Leonhard Euler", "Carl Gauss"};
        String[] sortedContacts2 = parseContacts(contacts2, "DESC");
        System.out.println(Arrays.toString(sortedContacts2));

        String[] emptyContacts = {};
        String[] sortedEmptyContacts = parseContacts(emptyContacts, "DESC");
        System.out.println(Arrays.toString(sortedEmptyContacts));

        String[] nullContacts = null;
        String[] sortedNullContacts = parseContacts(nullContacts, "DESC");
        System.out.println(Arrays.toString(sortedNullContacts));
    }
}
