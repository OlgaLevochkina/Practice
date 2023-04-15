package module12;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\n" + count);
    }
}
