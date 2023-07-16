package module21;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        String[] input = new String[quantity];
        fillArray(input);
        System.out.println(checkStringArray(input));
    }

    private static void fillArray(String[] input) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.next();
        }
    }

    public static boolean compareSymbols(String inputOne, String inputTwo) {
        int lastSymbol = inputOne.length() - 1;
        return inputOne.charAt(lastSymbol) == inputTwo.charAt(0);
    }

    public static boolean checkStringArray(String[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (!compareSymbols(input[i], input[i + 1])) {
                return false;
            }
        }
        return true;
    }
}
