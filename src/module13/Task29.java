package module13;

public class Task29 {
    public static final int MIN_SCORE = 0;
    public static final int MAX_SCORE = 50;
    public static final int STUDENTS = 12;

    public static void main(String[] args) {
        for (int i = 1; i <= STUDENTS; i++) {
            int firstStageOfCompetition = MIN_SCORE + (int) ((MAX_SCORE - MIN_SCORE + 1) * Math.random());
            int secondStageOfCompetition = MIN_SCORE + (int) ((MAX_SCORE - MIN_SCORE + 1) * Math.random());
            int sum = firstStageOfCompetition + secondStageOfCompetition;
            if (sum >= 80) {
                System.out.println("Student " + i + " got to the Finals: "
                        + firstStageOfCompetition + "+" + secondStageOfCompetition + "=" + sum);
            } else {
                System.out.println("Student " + i + " didn't get to the Finals: "
                        + firstStageOfCompetition + "+" + secondStageOfCompetition + "=" + sum);
            }
        }

    }
}
