package module15;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int originalNumber = scanner.nextInt();
        int nextNumber = scanner.nextInt();
        int count = 1;
        while (nextNumber>originalNumber){
            System.out.println("Enter one more number");
            count++;
            originalNumber=nextNumber;
            nextNumber=scanner.nextInt();
        }
        System.out.println("The total quantity of numbers is "+ count);
    }
}
