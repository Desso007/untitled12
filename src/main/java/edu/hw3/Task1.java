package edu.hw3;

public class Task1 {
    public static String atbash(String input) {
        StringBuilder result = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                char mirrored = (char)(base + ('Z' - Character.toUpperCase(c)));
                result.append(Character.isUpperCase(c) ? mirrored : Character.toLowerCase(mirrored));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String text = "My name is Roman";
        String encryptedText = atbash(text);
        System.out.println(encryptedText);
    }
}
