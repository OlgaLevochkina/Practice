package module21;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameOne = scanner.next();
        String nameTwo = scanner.next();
        checkIfTheSame(nameOne, nameTwo);
    }

    public static void checkIfTheSame(String nameOne, String nameTwo) {
        if (nameOne.equals(nameTwo)) {
            System.out.println("Same name");
        } else {
            System.out.println("Different names");
        }
    }
}
