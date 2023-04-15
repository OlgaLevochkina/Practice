package module12;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, countOfEvenNumbers = 0, countOfUnevenNumbers = 0;
        System.out.println("Enter 15 numbers");
        for (int i = 0; i < 15; i++) {
            number = scanner.nextInt();
            if (number % 2 == 0) {
                countOfEvenNumbers++;
            } else {
                countOfUnevenNumbers++;
            }
        }
        System.out.println("There are " + countOfEvenNumbers + " even numbers and " + countOfUnevenNumbers + " of uneven numbers");
    }
}
