package module11;

import java.util.Scanner;

public class Task57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int distance = scanner.nextInt();
        int number = 1;
        for (int i = 0; i < 15; i++) {
            System.out.print("#" + number);
            number += distance;
        }
    }
}
