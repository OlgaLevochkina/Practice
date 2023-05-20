package module16;

public class Task20 {
    public static final int MIN_SCORE = 1;
    public static final int MAX_SCORE = 5;
    public static final int STUDENTS = 35;
    public static final int SUBJECTS = 8;

    public static void main(String[] args) {
        double highestAvrScore = 0;
        int count = 0;

        for (int i = 1; i <= STUDENTS; i++) {
            System.out.print(i + " ");
            int sum = 0;
            for (int j = 1; j <= SUBJECTS; j++) {
                int studentsScore = MIN_SCORE + (int) ((MAX_SCORE - MIN_SCORE + 1) * Math.random());
                System.out.print(studentsScore + " ");
                sum += studentsScore;
            }
            double averageScore = (double) sum / SUBJECTS;
            if (averageScore >= 4.5) {
                count++;
            }
            if (averageScore > highestAvrScore) {
                highestAvrScore = averageScore;
            }

            System.out.print("The avr score is " + averageScore + " ");
            System.out.println();
        }
        System.out.println("The highest avr score is " + highestAvrScore);
        System.out.println("Quantity - " + count);
    }
}
