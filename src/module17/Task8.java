package module17;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int result = findOutTheNumber(number);
        System.out.println(result);
    }

    public static int findOutTheNumber(int clientsNumber) {
        return Integer.compare(clientsNumber, 0);
    }
}
