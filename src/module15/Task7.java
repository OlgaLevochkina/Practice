package module15;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        while (number != 123) {
            System.out.println("Error. Try again");
            number = sc.nextInt();
        }
        System.out.println("The code is correct");
    }
}
