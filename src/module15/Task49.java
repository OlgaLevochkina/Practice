package module15;

import java.util.Scanner;

public class Task49 {
    public static final int MAX_GRADE = 5;
    public static final int MIN_GRADE = 1;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = 1;
        int count = 0;
        int sum = 0;
        while (true) {
            grade = sc.nextInt();
            if (grade >= MIN_GRADE && grade <= MAX_GRADE) {
                sum += grade;
                count++;
            } else {
                break;
            }
        }
        double average = (double) sum / count;
        System.out.println("The average score is " + average);
    }
}
