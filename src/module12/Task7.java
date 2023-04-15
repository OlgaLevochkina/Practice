package module12;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int initialNumber = scanner.nextInt();
        int equal = 0, smaller = 0;
        System.out.println("Enter 29 numbers");
        for (int i = 0; i < 29; i++) {
            int newNumber = scanner.nextInt();
            if (newNumber == initialNumber) {
                equal++;
            }
            if (newNumber < initialNumber) {
                smaller++;
            }
        }
        System.out.println("There are " + equal + " same number(s)");
        System.out.println("There are " + smaller + " smaller number(s)");
    }
}
