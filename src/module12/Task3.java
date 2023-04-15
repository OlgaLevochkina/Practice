package module12;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count = 0;
        System.out.println("Enter 12 numbers");
        int firstNumber = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            number = sc.nextInt();
            if (number > firstNumber) {
                count++;
            }
        }
        System.out.println(count + " numbers are higher than the 1st number");
    }
}
