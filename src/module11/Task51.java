package module11;

import java.util.Scanner;

public class Task51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        for (int i = 1; i < x; i++) {
            System.out.print(i + "+");
        }
        System.out.println(x);
    }
}
