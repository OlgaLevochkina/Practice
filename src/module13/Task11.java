package module13;

public class Task11 {
    public static final int MIN_DAY = 1;
    public static final int MAX_DAY = 7;
    public static final int MIN_SCORE = 0;
    public static final int MAX_SCORE = 10;
    public static final int QUANTITY = 50;

    public static void main(String[] args) {
        for (int i = 0; i < QUANTITY; i++) {
            int randomDay = MIN_DAY + (int) ((MAX_DAY - MIN_DAY + 1) * Math.random());
            int randomScore = MIN_SCORE + (int) ((MAX_SCORE - MIN_SCORE + 1) * Math.random());
            System.out.println(i + ": " + randomDay + " " + randomScore);
            if (randomScore >= 7) {
                System.out.println("Danger");
            }
            if (randomDay == 2 && randomScore < 5) {
                System.out.println("Quiet Tuesday");
            }
        }
    }
}
