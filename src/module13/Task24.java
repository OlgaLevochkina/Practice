package module13;

public class Task24 {
    public static void main(String[] args) {
        int min = 30, max = 49;
        int initialRandomNumber = min + (int) ((max - min + 1) * Math.random());
        System.out.println(initialRandomNumber);
        for (int i = 0; i < 19; i++) {
            int randomNumber = min + (int) ((max - min + 1) * Math.random());
            if (randomNumber < initialRandomNumber) {
                System.out.print("-" + randomNumber + " ");
            } else {
                System.out.print("+" + randomNumber + " ");
            }
        }
    }
}
