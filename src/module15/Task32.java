package module15;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = 0;
        boolean isEven = false;
        while (quantity < 4) {
            System.out.println("Enter a number");
            int number = scanner.nextInt();
            if (number % 2 == 0 && !isEven) {
                quantity++;
            }
            isEven = !isEven;
        }
    }
}
