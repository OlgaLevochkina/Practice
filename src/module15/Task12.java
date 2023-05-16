package module15;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int originalNumber = sc.nextInt();
        System.out.println("Enter one more number");
        int nextNumber = sc.nextInt();
        int sum = originalNumber + nextNumber;
        while (originalNumber != nextNumber) {
            System.out.println("Enter one more number");
            sum += nextNumber;
            originalNumber = nextNumber;
            nextNumber = sc.nextInt();
        }
        sum -= nextNumber;
        System.out.println("The total sum of all numbers is " + sum);
    }
}
