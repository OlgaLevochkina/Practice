package module11;

import java.util.Scanner;

public class Task22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number higher than 112");
        int number = sc.nextInt();
        System.out.println("Start");
        for (int i = 0; i < 17; i++) {
            if (i == 0) {
                number = number - 10;
            } else {
                number = number - 6;
            }
            System.out.print(number + " ");
        }
        System.out.println("\nFinish");
    }
}
