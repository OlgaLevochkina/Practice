package module13;

public class Task13 {
    public static void main(String[] args) {
        int min = 1, max = 5;
        int numberStudentsFailed = 0, numberStudentsPassed = 0;
        int sumPassed = 0, sumFailed = 0;
        for (int i = 0; i < 30; i++) {
            int studentScore = min + (int) ((max - min + 1) * Math.random());
            System.out.print(studentScore + " ");
            if (studentScore < 3) {
                sumFailed += studentScore;
                numberStudentsFailed++;
            } else {
                sumPassed += studentScore;
                numberStudentsPassed++;
            }
        }
        int averageScorePassed = sumPassed / numberStudentsPassed;
        int averageScoreFailed = sumFailed / numberStudentsFailed;
        System.out.println("\nThe average score of the students passed is " + averageScorePassed);
        System.out.println("The average score of the students failed is " + averageScoreFailed);
    }
}
