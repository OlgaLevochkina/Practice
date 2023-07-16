package module21;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(checkIfPalindrome(input));
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
