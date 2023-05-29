package module17;

import java.util.Scanner;

public class Reader {
    public static int readInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");

        return scanner.nextInt();
    }
}
