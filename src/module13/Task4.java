package module13;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0, sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                count++;
                sum = sum + i;
                System.out.print(i + " ");
            }
        }
        System.out.println("\nThe number of dividors is " + count);
        System.out.println("The sum is " + sum);
    }
}
