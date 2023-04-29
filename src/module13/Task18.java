package module13;

import java.util.Scanner; //NOT DONE PROPERLY

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your deposit");
        int deposit = sc.nextInt();
        System.out.println("Enter the monthly percent");
        int percent = sc.nextInt();
        System.out.println("Enter the number of months");
        int months = sc.nextInt();
        double upgrade;
        for (int i = 0; i < months; i++) {
            upgrade = deposit * percent * 0.01;
            deposit += upgrade;
            System.out.print(deposit + " ");
        }
        System.out.println("\nThe final sum for " + months + " months is " + deposit);
    }
}
