package module11;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Start");
        for (int i = 0; i < 18; i++) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println("\nFinish");
    }
}
