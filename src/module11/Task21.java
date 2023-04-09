package module11;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        System.out.println("From");
        for (int i = (x + 1); i <= (x + 17); i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nto");
    }
}
