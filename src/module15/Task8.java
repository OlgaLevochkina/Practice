package module15;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, prevSum = 0;
        while (sum < 150) {
            System.out.println("Enter a number again");
            int number = scanner.nextInt();
            prevSum = sum;
            sum += number;
            count++;
        }
        System.out.println("The total sum is " + prevSum + " and the total quantity of numbers is " + (--count));
    }
}
