package module13;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int numberOne = sc.nextInt();
        int numberTwo = sc.nextInt();
        int numberThree = sc.nextInt();
        int differenceBetweenOneAndTwo = numberTwo - numberOne;
        int differenceBetweenTwoAndThree = numberThree - numberTwo;
        if (differenceBetweenOneAndTwo == differenceBetweenTwoAndThree) {
            for (int i = 0; i < 14; i++) {
                numberThree += differenceBetweenTwoAndThree;
                System.out.print(numberThree + " ");
            }
        } else {
            System.out.println("No");
        }
    }
}
