package module21;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String reversedInput = reverseString(input);
        System.out.println(reversedInput);
    }

    public static String reverseString(String input) {
        StringBuilder result = new StringBuilder((" "));
        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}
