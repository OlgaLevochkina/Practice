package module16;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
        for (int i = number + 1; i < 1000; i++) {
            int sumSecondNumber = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumSecondNumber += j;
                }
            }
            if (sumSecondNumber == number) {
                System.out.print(number + " " + i);
                break;
            }
        }
    }
}
