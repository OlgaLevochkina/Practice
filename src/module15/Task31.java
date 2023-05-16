package module15;

import java.util.Scanner;

public class Task31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = 0;
        while (quantity < 4) {
            System.out.println("Enter a number");
            int number = sc.nextInt();
            if (number % 2 == 0) {
                quantity++;
            }
        }
    }
}
