package module21;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(getSumOfNumbers(input));
    }

    public static int getSumOfNumbers(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
                sum += Character.getNumericValue(input.charAt(i));   // tolko dlq symbols (char)
            }
        }
        return sum;
    }
}
