package module21;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        calculate(input);
    }

    private static void calculate(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (isNumber(symbol)) {
                StringBuilder result = new StringBuilder(String.valueOf(symbol));
                i++;
                while (i != input.length() && isNumber(input.charAt(i))) {
                    result.append(input.charAt(i));
                    i++;
                }
                sum += Integer.parseInt(result.toString());
            }
        }
        System.out.println(sum);
    }

    private static boolean isNumber(char symbol) {
        return symbol >= '0' && symbol <= '9';
    }
}

