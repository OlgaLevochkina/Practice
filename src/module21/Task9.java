package module21;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String surname = scanner.next();
        checkTheLength(name, surname);
    }

    public static void checkTheLength(String name, String surname) {
        if (name.length() == surname.length()) {
            System.out.println("Same length");
        } else if (name.length() > surname.length()) {
            System.out.println("Name is longer");
        } else {
            System.out.println("Surname is longer");
        }
    }
}
