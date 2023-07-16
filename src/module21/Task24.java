package module21;

import java.util.Scanner;

public class Task24 {
    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        int quantity = SCANNER.nextInt();
        String[] input = new String[quantity];
        fillArray(input);
        getTheInputWithHigherNumberOfCapitals(input);
    }

    private static void fillArray(String[] input) {
        for (int i = 0; i < input.length; i++) {
            input[i] = SCANNER.next();
        }
    }

    public static int getTheNumberOfCapitals(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (checkIfCapitals(input.charAt(i))) {
                count++;
            }
        }
        return count;
    }

    public static boolean checkIfCapitals(char symbol) {
        return symbol >= 'A' && symbol <= 'Z';
    }

    public static void getTheInputWithHigherNumberOfCapitals(String[] input) {
        int indexOfMaxCapital = 0;
        int maxCapitalSymbols = 0;
        for (int i = 0; i < input.length; i++) {
            if (getTheNumberOfCapitals(input[i]) > maxCapitalSymbols) {
                maxCapitalSymbols = getTheNumberOfCapitals(input[i]);
                indexOfMaxCapital = i;
            }
        }
        System.out.println(input[indexOfMaxCapital]);
    }
}
