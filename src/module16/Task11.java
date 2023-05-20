package module16;

import java.util.Scanner;
//kakoe chislo podhodit???

public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int flag = 0;
        for (int i = 1; i <= number / 2; i++) {
            for (int j = 1; j <= i; j++) {
                if (Math.pow(i, 2) + Math.pow(j, 2) == i) {
                    System.out.println(Math.pow(i, 2) + "+" + Math.pow(j, 2));
                    flag = 1;
                }
            }
        }
        if (flag == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("Not possible");
        }
    }
}
