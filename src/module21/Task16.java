package module21;

import java.util.Scanner;

public class Task16 {

    public static final String STOP_WORD = "Finish";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(checkHowManyPalindromes(input));
    }

    public static int checkHowManyPalindromes(String input) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (!STOP_WORD.equals(input)) {
            if (checkIfPalindrome(input)) {
                count++;
            }
            input = scanner.next();
        }
        return count;
    }

    public static boolean checkIfPalindrome(String input) {
        int indexFromEnd = input.length() - 1;
        int indexFromStart = 0;
        boolean isPalindrome = true;
        while (isPalindrome && indexFromStart < indexFromEnd) {
            if (input.charAt(indexFromStart) != input.charAt(indexFromEnd)) {
                isPalindrome = false;
            }
            indexFromStart++;
            indexFromEnd--;
        }
        return isPalindrome;
    }
}
