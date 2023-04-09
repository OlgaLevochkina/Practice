package module11;

public class Task10 {
    public static void main(String[] args) {
        int min = 0, max = 9;
        for (int i = 0; i < 19; i++) {
            int randomNumber = max - (int) ((max - min + 1) * Math.random());
            if (randomNumber == 0) {
                System.out.print(" %" + randomNumber + "% ");
            } else {
                System.out.print(" " + randomNumber);
            }
        }
    }
}
