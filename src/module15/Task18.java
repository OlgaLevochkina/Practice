package module15;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        while (number > 10) {
            number = number / 10;
            System.out.println(number + " ");
        }
    }
}
