package module11;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        System.out.println("Start");
        x = x % 2 != 0 ? x + 2 : x + 1;   //ternarnij operator
        for (int i = 0; i < 25; i++) {
            System.out.print(x + " ");
            x += 2;
        }
        System.out.println("\nFinish");
    }
}
