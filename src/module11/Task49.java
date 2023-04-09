package module11;

import java.util.Scanner;

public class Task49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        for (int i = 1000; i < 10000; i++) {
            int firstPart = i / 100;
            int secondPart = i / 10 % 100;
            int lastPart = i - firstPart * 100;
            if (x == firstPart || x == secondPart || x == lastPart) {
                System.out.print(i + " ");
            }
        }
    }
}
