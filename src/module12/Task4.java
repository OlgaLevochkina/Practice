package module12;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 17 numbers");
        int newNumber, count = 0;
        int previousNumber = sc.nextInt();
        for (int i = 0; i < 16; i++) {
            newNumber = sc.nextInt();
            if (newNumber > previousNumber) {
                count++;
            }
            previousNumber = newNumber;
        }
        System.out.println(count);
    }
}
