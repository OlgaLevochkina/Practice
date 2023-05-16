package module15;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        while (number!=0){
            if (number>0){
                System.out.println("Positive");
            } else {
                System.out.println("Negative");
            }
            number = scanner.nextInt();
        }
    }
}
