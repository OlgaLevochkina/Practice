package module13;

public class Task12 {
    public static final int MIN_SCORE = 1;
    public static final int MAX_SCORE = 5;
    public static final int STUDENTS = 30;

    public static void main(String[] args) {
        int countFail = 0, sum = 0;
        for (int i = 0; i < STUDENTS; i++) {
            int studentScore = MIN_SCORE + (int) ((MAX_SCORE - MIN_SCORE + 1) * Math.random());
            System.out.print(studentScore + " ");
            sum += studentScore;
            if (studentScore <= 2) {
                countFail++;
            }
        }
        int averageScore = sum / 30;
        System.out.println("\nThe average score is " + averageScore);
        System.out.println("The number of students failed is " + countFail);
    }
}
