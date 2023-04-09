package module11;

public class Task11 {
    public static void main(String[] args) {
        int min = 10, max = 99;
        for (int i = 0; i < 11; i++) {
            int randomNumber = max - (int) ((max - min + 1) * Math.random());
            int firstDigit = randomNumber / 10;
            int secondDigit = randomNumber % 10;
            if (randomNumber % 5 == 0) {
                int sum = firstDigit + secondDigit;
                System.out.print(randomNumber + "(" + sum + ") ");
            } else {
                int multiplication = firstDigit * secondDigit;
                System.out.print(randomNumber + "[" + multiplication + "] ");
            }
        }
    }
}
