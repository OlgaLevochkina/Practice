package module10;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        task12();
    }

    public static void task12() {
        int minNumber = 2, maxNumber = 11;
        int firstRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int secondtRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int thirdRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int sum;
        System.out.println(firstRandomNumber + "," + secondtRandomNumber + "," + thirdRandomNumber);
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 if you would like to get another card");
        int clientNumber = sc.nextInt();
        if (clientNumber == 1) {
            int fourthRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
            sum = firstRandomNumber + secondtRandomNumber + thirdRandomNumber + fourthRandomNumber;
            System.out.println(fourthRandomNumber);
        } else {
            sum = firstRandomNumber + secondtRandomNumber + thirdRandomNumber;
        }
        int sum2 = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        sum2 += minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        sum2 += minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        System.out.println(sum);
        System.out.println(sum2);
        if (sum < sum2) {
            System.out.println("Not enough");
        }
        if (sum > sum2) {
            System.out.println("Too much");
        }
        if (sum == sum2) {
            System.out.println("Bingo");
        }
    }
}
