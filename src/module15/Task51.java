package module15;

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the current amount on your account");
        int clientInitialAmount = scanner.nextInt();
        System.out.println("Enter the overdraft");
        int overdraft = scanner.nextInt();
        int currentBalance = clientInitialAmount + overdraft;
        int deposits = 0, withdrawal = 0;
        while (true) {
            System.out.println("Please proceed with your action - add a deposit or withdraw the amount");
            int actionTaken = scanner.nextInt();
            if (actionTaken > 0) {
                currentBalance += actionTaken;
                deposits++;
            } else if (actionTaken < 0) {
                if (currentBalance + actionTaken > 0) {
                    currentBalance = currentBalance + actionTaken;
                    withdrawal++;
                } else {
                    System.out.println("Not enough funds");
                    break;
                }
            } else {
                break;
            }
            System.out.println("The total number of deposits is " + deposits);
            System.out.println("The total number of withdrawals is " + withdrawal);
            System.out.println("The current balance is " + currentBalance);
        }
    }
}
