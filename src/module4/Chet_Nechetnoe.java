package module4;

import java.util.Scanner;

public class Chet_Nechetnoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your number");
        number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }
}
