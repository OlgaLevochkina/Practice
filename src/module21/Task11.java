package module21;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String surname = scanner.next();
        checkFirstAndLastLetters(surname);
    }

    public static void checkFirstAndLastLetters(String surname) {
        if (surname.charAt(0) == surname.charAt(surname.length() - 1)) {
            System.out.println("Same letter");
        } else {
            System.out.println("Different letters");
        }
    }
}
