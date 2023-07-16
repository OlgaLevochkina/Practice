package module21;

import java.util.Scanner;


public class Task12 {

    public static final int QUANTITY = 15;

    public static void main(String[] args) {
        System.out.println(getTotalCount());
    }

    public static int estimateHowManyTimes(String surname, char firstLetterOfName) {
        int count = 0;
        for (int i = 0; i < surname.length(); i++) {
            if (surname.charAt(i) == firstLetterOfName) {
                count++;
            }
        }
        return count;
    }

    public static int getTotalCount() {
        Scanner sc = new Scanner(System.in);
        int totalCount = 0;
        for (int i = 0; i < QUANTITY; i++) {
            System.out.println("Enter a name and then surname");
            String name = sc.next();
            String surname = sc.next();
            if (estimateHowManyTimes(surname, name.charAt(0)) > 1) {
                totalCount++;
            }
        }
        return totalCount;
    }
}
