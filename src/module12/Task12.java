package module12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int winterBorn = 0, springBorn = 0, summerBorn = 0, autumnBorn = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your day of birth");
            int day = sc.nextInt();
            System.out.println("Enter your month of birth");
            int month = sc.nextInt();
            System.out.println("Enter your year of birth");
            int year = sc.nextInt();

        }
        System.out.println(winterBorn + " kid(s) were born in winter");
        System.out.println(springBorn + " kid(s) were born in spring");
        System.out.println(summerBorn + " kid(s) were born in summer");
        System.out.println(autumnBorn + " kid(s) were born in autumn");
    }
}
