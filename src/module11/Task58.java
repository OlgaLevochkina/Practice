package module11;

import java.util.Scanner;

public class Task58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Enter a number again");
            int additionalNumber = sc.nextInt();
            if (additionalNumber > 0) {
                System.out.println(additionalNumber + "(" + (int) Math.pow(additionalNumber, 2) + ")");
            } else {
                System.out.println("Skip");
            }
        }
    }
}
