package module12;

import java.math.BigInteger;
import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers = center of the circle");
        int circleCenterX = sc.nextInt();
        int circleCenterY = sc.nextInt();
        System.out.println("Enter the radius of the circle");
        int radius = sc.nextInt();
        int randomPointX, randomPointY, min = 0, max = 20;
        for (int i = 0; i < 15; i++) {
            randomPointX = min + (int) ((max - min + 1) * Math.random());
            randomPointY = min + (int) ((max - min + 1) * Math.random());
            if (Math.pow((randomPointX - circleCenterX), 2) + Math.pow((randomPointY - circleCenterY), 2) <= Math.pow(radius, 2)) {
                System.out.println("The point N" + i + "(" + randomPointX + "," + randomPointY + ") is in the circle");
            }
        }
    }
}
