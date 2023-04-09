package module11;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        System.out.println("Start");
        int number = -x + 1;
        for (int i = number; i < x; i++) {
            System.out.print(number + " ");
            number++;
        }
        System.out.println("\nFinish");
    }
}
