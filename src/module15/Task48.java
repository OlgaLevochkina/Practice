package module15;

import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of seats for adults");
        int totalAdults = scanner.nextInt();
        System.out.println("Enter the total number of seats for kids");
        int totalKids = scanner.nextInt();
        int groupCount = 0, adultsSeatsCount = 0, kidsSeatsCount = 0;
        int adults = 0, kids = 0;
        while (adultsSeatsCount < totalAdults && kidsSeatsCount < totalKids) {
            groupCount++;
            System.out.println("How many seats for adults and kids would you like to buy");
            adults = scanner.nextInt();
            kids = scanner.nextInt();
            if (adultsSeatsCount + adults > totalAdults && kidsSeatsCount + kids > totalKids) {
                break;
            } else {
                adultsSeatsCount += adults;
                kidsSeatsCount += kids;
            }
        }
        if (adultsSeatsCount > totalAdults && kidsSeatsCount < totalKids) {
            System.out.println("Sorry. No more seats for adults");
        }
        if (adultsSeatsCount < totalAdults && kidsSeatsCount > totalKids) {
            System.out.println("Sorry. No more seats for kids");
        }
        if (adultsSeatsCount > totalAdults && kidsSeatsCount > totalKids) {
            System.out.println("Sorry. No more seats.");
        }
        groupCount--;
        System.out.println("Total number of groups is " + groupCount + ", the total number of adults seats sold is  " + adultsSeatsCount + ", " +
                "the total number of kids seats sold is " + kidsSeatsCount);
        int adultSeatsLeft = totalAdults - adultsSeatsCount;
        int kidsSeatsLeft = totalKids - kidsSeatsCount;
        System.out.println();
        System.out.println("The number of adult seats left is " + adultSeatsLeft);
        System.out.println("The number of kids seats left is " + kidsSeatsLeft);
    }
}
