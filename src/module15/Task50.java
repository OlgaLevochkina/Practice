package module15;

import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantity = 30, mistakes = 0, sum = 0;
        for (int i = 0; i < quantity; i++) {
            System.out.println("Enter your score");
            int score = sc.nextInt();
            while (score < 1 || score > 5) {
                score = sc.nextInt();
                mistakes++;
            }
            sum += score;
        }
        double average = (double) sum / quantity;
        System.out.println("The average score is " + average);
        System.out.println("The number of mistakes is " + mistakes);
    }
}
