package module15;

import java.util.Scanner;

public class Task39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int divider = 1;
        while (divider < number) {
            divider++;
            if (number % divider == 0) {
                System.out.println(divider);
                break;
            }
        }
        if (divider == number) {
            System.out.println("This is a primary number");
        }
    }
}
