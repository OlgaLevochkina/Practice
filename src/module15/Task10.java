package module15;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int originalNumber = sc.nextInt();
        int prevNumber = 0;
        while (originalNumber > 0) {
            System.out.println("Enter a new number");
            int newNumber = sc.nextInt();
            prevNumber = originalNumber;
            originalNumber = originalNumber - newNumber;
        }
        System.out.println(prevNumber);
    }
}

