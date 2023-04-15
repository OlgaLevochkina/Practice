package module12;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the quantity of students");
        int quantity = scanner.nextInt();
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter the marks");
            int marks = scanner.nextInt();
            if (marks <= 2) {
                count++;
            }
        }
        System.out.println(count);
        if (count < quantity / 2) {
            System.out.println("Fail");
        } else {
            System.out.println("Good job");
        }
    }
}
