package module11;

import java.util.Scanner;

public class Task53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int m = sc.nextInt();
        int n = sc.nextInt(); //higher number
        for (int i = m; i < n; i++) {
            System.out.print(i + "+");
        }
        System.out.println(n);
    }
}
