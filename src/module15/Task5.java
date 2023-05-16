package module15;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int count = 0;
        while (number!=999){
            count++;
            number = sc.nextInt();
        }
        System.out.println("The total number is "+ count);
    }
}
