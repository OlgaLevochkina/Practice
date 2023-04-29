package module13;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countOrdinary = 0, countSpecial = 0, countFree = 0;
        for (int i = 0; i < 200; i++) {
            System.out.println("Enter how many ordinary tickets would you like to buy");
            int ordinaryTicket = sc.nextInt();
            System.out.println("Enter how many special tickets would you like to buy");
            int specialTicket = sc.nextInt();
            if (ordinaryTicket > 10) {
                countFree++;
                ordinaryTicket += 1;
            }
            countOrdinary += ordinaryTicket;
            countSpecial += specialTicket;
        }
        System.out.println("The number of ordinary tickets sold is " + countOrdinary);
        System.out.println("The number of special tickets sold is " + countSpecial);
        System.out.println("The number of free tickets given is " + countFree);
    }
}
