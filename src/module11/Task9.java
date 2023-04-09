package module11;

public class Task9 {
    public static void main(String[] args) {
        int min = 27, max = 73;
        for (int i = 0; i < 20; i++) {
            int randomNumber = max - (int) ((max - min + 1) * Math.random());
            if (randomNumber % 3 == 0) {
                System.out.print("#" + randomNumber);
            } else {
                System.out.print(" "+ randomNumber);
            }
        }
    }
}
