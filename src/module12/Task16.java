package module12;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        boolean isComposite = false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isComposite = true;
                break;
            }
        }
        if (isComposite) {
            System.out.println("This is not a primary number");
        } else {
            System.out.println("This is a primary number");
        }
    }
}
