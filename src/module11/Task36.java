package module11;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        System.out.println("Start");
        for (int i = 0; i < 10; i++) {
            x -= 6;
            System.out.print(x + " ");
        }
        System.out.println("\nFinish");
    }
}
