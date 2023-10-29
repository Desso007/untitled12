package edu.hw3;

public class Task4 {
    public static String convertToRoman(int num) {
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder roman = new StringBuilder();
        int i = 0;

        while (num > 0) {
            if (num >= values[i]) {
                roman.append(romanNumerals[i]);
                num -= values[i];
            } else {
                i++;
            }
        }

        return roman.toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToRoman(2));  // ➞ "II"
        System.out.println(convertToRoman(12));  // ➞ "XII"
        System.out.println(convertToRoman(16));  // ➞ "XVI"
    }
}
