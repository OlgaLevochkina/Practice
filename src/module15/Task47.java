package module15;

import java.util.Scanner;

public class Task47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total quantity of tickets");
        int tickets = scanner.nextInt();
        int count = 0, rejected = 0;
        while (tickets != 0) {
            System.out.println("How many tickets would you like to buy");
            int soldTickets = scanner.nextInt();
            if (tickets - soldTickets >= 0) {
                count++;
                tickets -= soldTickets;
                System.out.println("Purchase is successful");
            } else {
                rejected++;
                System.out.println("Sorry. Not enough tickets available");
            }
        }
        System.out.println();
        System.out.println("The number of clients who bought tickets is " + count);
        System.out.println("The number of clients rejected is " + rejected);
    }
}

