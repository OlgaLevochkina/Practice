package module15;

import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int divider = number;
        while (divider > 0) {
            divider--;
            if (number % divider == 0) {
                System.out.println(divider);
                break;
            }
        }
    }
}
