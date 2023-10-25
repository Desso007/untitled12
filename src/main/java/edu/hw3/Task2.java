package edu.hw3;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Task2 {
    public static List<String> clusterize(String input) {
        List<String> clusters = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        int startIndex = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                stack.push(i);
                if (stack.size() == 1) {
                    startIndex = i;
                }
            } else if (input.charAt(i) == ')' && !stack.isEmpty()) {
                stack.pop();
                if (stack.isEmpty()) {
                    clusters.add(input.substring(startIndex, i + 1));
                }
            }
        }

        return clusters;
    }

    public static void main(String[] args) {
        String input1 = "()()()";
        String input2 = "((()))";
        String input3 = "((()))(())()()(()())";
        String input4 = "((())())(()(()()))";

        List<String> clusters1 = clusterize(input1);
        List<String> clusters2 = clusterize(input2);
        List<String> clusters3 = clusterize(input3);
        List<String> clusters4 = clusterize(input4);

        System.out.println(clusters1);
        System.out.println(clusters2);
        System.out.println(clusters3);
        System.out.println(clusters4);
    }
}
