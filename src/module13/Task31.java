package module13;

public class Task31 {
    public static final int SCORE_MIN = 1;
    public static final int SCORE_MAX = 10;

    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            int mathScore = SCORE_MIN + (int) ((SCORE_MAX - SCORE_MIN + 1) * Math.random());
            int physicsScore = SCORE_MIN + (int) ((SCORE_MAX - SCORE_MIN + 1) * Math.random());
            int averageScore = (mathScore + physicsScore) / 2;
            if (averageScore >= 7) {
                if (mathScore > physicsScore) {
                    System.out.println("Your average score is " + averageScore + " and you are in. The student " + i + " is going to Math class");
                } else {
                    System.out.println("Your average score is " + averageScore + " and you are in. The student " + i + " is going to Physics class");
                }
            } else {
                System.out.println("Student " + i + " , you can try again next year. Your average score is " + averageScore);
            }
        }
    }
}
