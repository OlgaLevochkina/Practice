package module11;

import java.util.Scanner;

public class Task52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        for (int i = x; i > 1; i--) {
            System.out.print(i + "+");
        }
        System.out.println("1");
    }
}
