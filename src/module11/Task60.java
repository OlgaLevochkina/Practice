package module11;

import java.util.Scanner;

public class Task60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }
}
