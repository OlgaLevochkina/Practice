package module21;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();
        checkTheFirstLetters(name, surname);
    }

    public static void checkTheFirstLetters(String name, String surname) {
        if (name.charAt(0) == surname.charAt(0)) {
            System.out.println("Same letter");
        } else {
            System.out.println("Different first letters");
        }
    }
}
