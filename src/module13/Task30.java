package module13;

public class Task30 {
    public static final int DIAMETER_MIN = 22;
    public static final int DIAMETER_MAX = 26;
    public static final int WEIGHT_MIN = 71;
    public static final int WEIGHT_MAX = 77;
    public static final int MIN = 0;
    public static final int MAX = 100;
    public static final int BALLS = 120;

    public static void main(String[] args) {
        for (int i = 0; i < BALLS; i++) {
            int randomDIAMETER = DIAMETER_MIN + (int) ((DIAMETER_MAX - DIAMETER_MIN + 1) * Math.random());
            int randomWeight = WEIGHT_MIN + (int) ((WEIGHT_MAX - WEIGHT_MIN + 1) * Math.random());
            if (randomWeight >= WEIGHT_MIN && randomWeight <= WEIGHT_MAX
                    && randomDIAMETER >= DIAMETER_MIN && randomDIAMETER <= DIAMETER_MAX) {
                System.out.println(i + " is up to standard");
            } else {
                System.out.println(i + " is not up to standard");
            }
        }
    }
}
